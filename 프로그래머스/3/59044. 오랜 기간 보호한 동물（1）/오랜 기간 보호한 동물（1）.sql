SELECT name, datetime
FROM
(SELECT i.*, RANK() OVER (ORDER BY i.datetime ASC) AS ranking
FROM animal_ins i
LEFT OUTER JOIN animal_outs o
ON i.animal_id = o.animal_id
WHERE o.datetime IS NULL 
ORDER BY i.datetime ASC) AS sub
WHERE sub.ranking BETWEEN 1 AND 3
SELECT pt_name, pt_no, gend_cd, age, coalesce(tlno, 'NONE') as tlno
FROM patient
WHERE age <= 12 AND gend_CD = 'W'
ORDER BY age DESC, pt_name ASC
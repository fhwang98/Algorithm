SELECT CAST(date_format(datetime, '%H') as signed) AS hour,
count(*) as count
FROM animal_outs
WHERE CAST(date_format(datetime, '%H') as signed) >= 9
    AND CAST(date_format(datetime, '%H') as signed) < 20
GROUP BY date_format(datetime, '%H')
ORDER BY date_format(datetime, '%H') ASC
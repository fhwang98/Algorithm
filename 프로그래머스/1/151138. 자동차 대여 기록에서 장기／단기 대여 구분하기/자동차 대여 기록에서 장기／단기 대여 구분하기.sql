SELECT history_id, car_id, date_format(start_date, '%Y-%m-%d') AS start_date, date_format(end_date, '%Y-%m-%d') AS end_date, 
(CASE
    WHEN datediff(end_date, start_date) >= 29 THEN '장기 대여'
    ELSE '단기 대여'
END) as rent_type
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE date_format(start_date, '%Y-%m') = '2022-09'
ORDER BY history_id DESC
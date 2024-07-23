SELECT car_id, round(avg(datediff(end_date, start_date) + 1), 1) as average_duration
FROM car_rental_company_rental_history
GROUP BY car_id
HAVING avg(datediff(end_date, start_date) + 1) >= 7
ORDER BY average_duration DESC, car_id DESC


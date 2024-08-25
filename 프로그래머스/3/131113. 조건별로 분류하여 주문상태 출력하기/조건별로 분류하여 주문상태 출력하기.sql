-- 코드를 입력하세요
SELECT order_id, product_id, date_format(out_date, '%Y-%m-%d'), 
(CASE 
 WHEN DATEDIFF(out_date, '2022-05-01') <= 0 THEN '출고완료'
 WHEN DATEDIFF(out_date, '2022-05-01') > 0 THEN '출고대기'
 ELSE '출고미정'
END) AS '출고여부'
FROM food_order
ORDER BY order_id ASC
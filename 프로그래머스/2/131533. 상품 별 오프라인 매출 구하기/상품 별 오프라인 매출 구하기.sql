-- 코드를 입력하세요
SELECT product_code, sum(p.price * o.sales_amount) AS sales
FROM product p 
INNER JOIN offline_sale o
ON p.product_id = o.product_id
GROUP BY p.product_id
ORDER BY sales DESC, product_code ASC;
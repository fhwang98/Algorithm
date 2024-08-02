-- 코드를 입력하세요
SELECT category, sum(sales) AS total_sales
FROM book b
INNER JOIN book_sales s
ON b.book_id = s.book_id
WHERE date_format(sales_date, '%Y-%m') = '2022-01'
GROUP BY b.category
ORDER BY category ASC
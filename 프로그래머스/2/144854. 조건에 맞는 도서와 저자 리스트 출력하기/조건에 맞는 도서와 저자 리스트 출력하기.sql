-- 코드를 입력하세요
SELECT b.book_id, a.author_name, date_format(b.published_date, '%Y-%m-%d') AS published_date
FROM book b
INNER JOIN author a
ON b.author_id = a.author_id
WHERE category = '경제'
ORDER BY b.published_date ASC;
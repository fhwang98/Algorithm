-- 코드를 입력하세요
SELECT u.user_id , u.nickname, sum(b.price) AS total_sales
FROM used_goods_board b
INNER JOIN used_goods_user u
ON b.writer_id = u.user_id
WHERE status = 'DONE'
GROUP BY b.writer_id
HAVING sum(b.price) >= 700000
ORDER BY sum(b.price) ASC
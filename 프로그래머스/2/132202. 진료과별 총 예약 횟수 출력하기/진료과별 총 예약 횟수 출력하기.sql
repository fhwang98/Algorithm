-- 코드를 입력하세요
SELECT mcdp_cd AS 진료과코드, count(*) AS 5월예약건수
FROM appointment
WHERE date_format(apnt_ymd, '%Y-%m') = '2022-05'
GROUP BY mcdp_cd
ORDER BY 5월예약건수 ASC, 진료과코드 ASC
-- 코드를 입력하세요
SELECT
    warehouse_id,
    warehouse_name,
    address,
    IFNULL(freezer_YN, 'N') as freezer_YN
FROM food_warehouse
WHERE address LIKE '경기도%'
ORDER BY warehouse_name ASC;
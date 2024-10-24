SELECT
    floor(price / 10000) * 10000 AS price_group, count(*) AS products
FROM product
    GROUP BY floor(price / 10000)
    ORDER BY floor(price / 10000)
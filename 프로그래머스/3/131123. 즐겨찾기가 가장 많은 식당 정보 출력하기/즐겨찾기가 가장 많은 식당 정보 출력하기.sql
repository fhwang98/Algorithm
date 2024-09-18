SELECT
    food_type, rest_id, rest_name, favorites
FROM rest_info o
WHERE favorites = (
    SELECT MAX(favorites)
    FROM rest_info i
    WHERE o.food_type = i.food_type
)
ORDER BY food_type DESC
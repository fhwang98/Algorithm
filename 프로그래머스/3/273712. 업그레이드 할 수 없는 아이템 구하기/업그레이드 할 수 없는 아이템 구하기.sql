SELECT i.item_id, i.item_name, i.rarity FROM ITEM_INFO i
LEFT OUTER JOIN ITEM_TREE t
ON i.item_id = t.parent_item_id
WHERE t.parent_item_id IS NULL
ORDER BY i.item_id DESC

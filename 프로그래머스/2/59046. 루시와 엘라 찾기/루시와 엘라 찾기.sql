SELECT animal_id, name, sex_upon_intake
FROM animal_ins
WHERE name in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY animal_id ASC
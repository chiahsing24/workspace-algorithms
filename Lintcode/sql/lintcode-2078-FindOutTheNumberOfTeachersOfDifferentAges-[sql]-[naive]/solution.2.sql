SELECT age, IF(age IS NULL, 0, COUNT(1)) as age_count FROM teachers GROUP BY age ORDER BY age DESC;
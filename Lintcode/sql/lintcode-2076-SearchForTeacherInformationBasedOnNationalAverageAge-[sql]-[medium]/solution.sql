SELECT * 
FROM teachers 
WHERE country 
IN (
    SELECT country
    FROM teachers
    GROUP BY country
    HAVING AVG(age) > (
        SELECT AVG(age) FROM teachers
    )
)
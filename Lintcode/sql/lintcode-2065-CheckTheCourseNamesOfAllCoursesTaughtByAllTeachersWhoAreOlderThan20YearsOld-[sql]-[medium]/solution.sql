SELECT c.name 
FROM courses c
JOIN teachers ts
ON ts.id = c.teacher_id
WHERE ts.id IN (
    SELECT t.id 
    FROM teachers t
    WHERE t.age > 20
)
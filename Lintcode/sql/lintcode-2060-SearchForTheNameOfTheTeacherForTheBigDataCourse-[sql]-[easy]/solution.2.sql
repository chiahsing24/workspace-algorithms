SELECT name 
FROM teachers
WHERE id 
IN (
    SELECT teacher_id 
    FROM courses
    WHERE name = 'Big Data'
)
DELETE FROM teachers
WHERE id 
IN (
    SELECT teacher_id
    FROM courses
    WHERE created_at < '2020-01-01'
)
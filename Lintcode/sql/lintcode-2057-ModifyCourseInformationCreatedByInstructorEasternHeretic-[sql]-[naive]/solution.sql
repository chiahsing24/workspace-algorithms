UPDATE courses c
SET c.name = 'PHP', c.student_count = 300
WHERE c.teacher_id 
IN (
    SELECT t.id
    FROM teachers t
    WHERE t.name = 'Eastern Heretic'
)
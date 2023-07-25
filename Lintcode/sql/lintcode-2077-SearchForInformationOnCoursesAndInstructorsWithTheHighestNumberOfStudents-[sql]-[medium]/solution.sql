SELECT c.name course_name, c.student_count, t.name teacher_name
FROM teachers t
INNER JOIN courses c
ON c.teacher_id = t.id 
WHERE c.student_count = (
    SELECT MAX(student_count) 
    FROM courses
)
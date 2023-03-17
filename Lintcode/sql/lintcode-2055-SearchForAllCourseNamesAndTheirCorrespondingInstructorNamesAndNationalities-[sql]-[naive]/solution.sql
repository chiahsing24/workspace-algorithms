SELECT c.name course_name, t.name teacher_name, t.country teacher_country 
FROM teachers t LEFT OUTER JOIN courses c ON c.teacher_id = t.id
UNION
SELECT c.name course_name, t.name teacher_name, t.country teacher_country 
FROM teachers t RIGHT OUTER JOIN courses c ON c.teacher_id = t.id;
SELECT c.id, c.name AS course_name, t.name AS teacher_name FROM courses c INNER JOIN teachers t ON c.teacher_id = t.id WHERE t.name = 'Eastern Heretic';
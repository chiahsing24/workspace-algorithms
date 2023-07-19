-- Write your SQL Query here --
-- example: SELECT * FROM XX_TABLE --
SELECT t.name as 'teacher_name', IFNULL(count(c.teacher_id), 0) as 'course_count' 
FROM teachers t
LEFT JOIN courses c
ON t.id = c.teacher_id
GROUP BY t.name
ORDER BY course_count DESC, teacher_name ASC
SELECT t.name 
FROM teachers t 
INNER JOIN courses c 
ON c.teacher_id = t.id 
WHERE c.name = 'Big Data'
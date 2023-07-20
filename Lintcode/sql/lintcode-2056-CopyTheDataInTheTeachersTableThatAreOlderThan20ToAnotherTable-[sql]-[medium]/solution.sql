INSERT INTO teachers_bkp
(   
    SELECT *
    FROM teachers
    WHERE age > 20
)
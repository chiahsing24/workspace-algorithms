SELECT name, DATE_ADD(created_at, INTERVAL 1 DAY) new_created FROM courses;
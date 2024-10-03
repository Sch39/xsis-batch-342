SELECT CONCAT(bi.first_name, ' ', bi.last_name),
  em.id employee_id
FROM employees em
  RIGHT JOIN biodata bi ON em.biodata_id = bi.id
WHERE em.id IS NULL;
SELECT CONCAT(bi.first_name, ' ', bi.last_name) fullname,
  em.salary old_salary,
  ((em.salary * 0.1) + em.salary) new_salary
FROM employees em
  RIGHT JOIN biodata bi ON em.biodata_id = bi.id;
SELECT CONCAT(bi.first_name, ' ', bi.last_name) fullname,
  em.nip,
  em.status,
  em.salary,
  AVG(em.salary) avg_salary
FROM employees em
  JOIN biodata bi ON em.biodata_id = bi.id
GROUP BY fullname,
  em.nip,
  em.salary,
  em.status;
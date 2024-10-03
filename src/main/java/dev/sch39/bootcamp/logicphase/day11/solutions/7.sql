SELECT em.id employee_id,
  em.nip,
  CONCAT(bi.first_name, ' ', bi.last_name) fullname
FROM employees em
  INNER JOIN biodata bi ON em.biodata_id = bi.id
  LEFT JOIN travel_requests tr ON em.id = tr.employee_id
WHERE tr.id IS NULL;
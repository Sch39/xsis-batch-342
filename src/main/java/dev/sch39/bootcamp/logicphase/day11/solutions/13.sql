SELECT em.nip,
  CONCAT(bi.first_name, ' ', bi.last_name)
FROM employees em
  INNER JOIN biodata bi ON em.biodata_id = bi.id
WHERE bi.dob BETWEEN '1991-01-01' AND '1991-12-31';
SELECT em.nip,
  em.status,
  bi.first_name,
  bi.last_name,
  bi.dob
FROM employees em
  INNER JOIN biodata bi ON em.biodata_id = bi.id
ORDER BY bi.dob ASC;
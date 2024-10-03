SELECT CONCAT(bi.first_name, ' ', bi.last_name) fullname,
  p.name position,
  DATE_PART('year', AGE(bi.dob::DATE)) age,
  CASE
    WHEN fa.status ILIKE '%anak%' THEN COUNT(fa.status)
    ELSE 0
  END child_count
FROM employees em
  JOIN biodata bi ON em.biodata_id = bi.id
  JOIN employee_positions emp ON em.id = emp.employee_id
  JOIN positions p ON emp.position_id = p.id
  LEFT JOIN families fa ON bi.id = fa.biodata_id
GROUP BY fullname,
  position,
  age,
  fa.status;
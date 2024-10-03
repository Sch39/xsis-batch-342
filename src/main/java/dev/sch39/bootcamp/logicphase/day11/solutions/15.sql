SELECT em.nip,
  el.regular_quota
FROM employees em
  JOIN employee_leaves el ON em.id = el.employee_id
WHERE el.periode = '2020';
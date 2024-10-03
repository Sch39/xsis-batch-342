INSERT INTO employee_leaves(employee_id, periode, regular_quota)
SELECT em.id,
  '2021',
  12
FROM employees em
  LEFT JOIN employee_leaves el ON em.id = el.employee_id
WHERE el.periode::INT < 2021
  OR el.periode IS NULL;
SELECT em.nip,
  COUNT(lr.id) leave_total
FROM leave_requests lr
  LEFT JOIN employees em ON lr.employee_id = em.id
WHERE DATE_PART('year', lr.start_date) = 2020
GROUP BY em.nip;
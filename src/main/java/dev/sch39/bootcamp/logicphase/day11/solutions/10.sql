SELECT bi.last_name,
  (em.salary * 0.2) bonus,
  ((em.salary * 0.2) + em.salary) bonus_plus_salary
FROM employees em
  JOIN biodata bi ON em.biodata_id = bi.id
WHERE bi.last_name ILIKE '%a%'
  OR bi.last_name ILIKE '%i%'
  OR bi.last_name ILIKE '%u%'
  OR bi.last_name ILIKE '%e%'
  OR bi.last_name ILIKE '%o%';
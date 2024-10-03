SELECT em.nip,
  COUNT(bi.id) absent
FROM biodata bi
  JOIN employees em ON bi.id = em.biodata_id
  JOIN leave_requests lr ON em.id = lr.employee_id
  JOIN travel_requests tr ON em.id = tr.employee_id
WHERE bi.first_name ILIKE '%raya%'
  AND DATE_PART('year', tr.start_date)::INT = 2020
  AND DATE_PART('year', lr.start_date)::INT = 2020
GROUP BY em.nip;
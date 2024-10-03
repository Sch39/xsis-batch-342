SELECT lr.id leave_request_id,
  em.nip,
  bi.first_name,
  bi.last_name,
  le.type leave_type,
  lr.reason,
  DATE_PART('day', AGE(lr.end_date, lr.start_date)) duration_day,
  cp.contact
FROM leave_requests lr
  RIGHT JOIN employees em ON lr.employee_id = em.id
  INNER JOIN biodata bi ON em.biodata_id = bi.id
  JOIN leaves le ON lr.leave_id = le.id
  JOIN contact_persons cp ON bi.id = cp.biodata_id
WHERE cp.type = 'PHONE';
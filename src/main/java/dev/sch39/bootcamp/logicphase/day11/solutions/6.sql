SELECT tr.id tr_id,
  CONCAT(bi.first_name, ' ', bi.last_name) fullname,
  tt.name travel_type,
  (SUM(ts.item_cost)) total_expenditure
FROM employees em
  INNER JOIN biodata bi ON em.biodata_id = bi.id
  INNER JOIN travel_requests tr ON em.id = tr.employee_id
  INNER JOIN travel_types tt ON tr.travel_type_id = tt.id
  INNER JOIN travel_settlements ts ON tr.id = ts.travel_request_id
GROUP BY tr.id,
  fullname,
  travel_type;
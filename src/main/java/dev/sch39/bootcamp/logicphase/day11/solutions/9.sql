SELECT lr.reason,
  COUNT(lr.reason)
FROM leave_requests lr
GROUP BY lr.reason
ORDER BY COUNT(lr.reason) DESC
LIMIT 1;
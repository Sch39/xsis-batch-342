SELECT st.code,
  st.name,
  sc.score,
  ex.is_active
FROM students st
  INNER JOIN scores sc ON st.code = sc.student_code
  INNER JOIN exams ex ON sc.exam_code = ex.code
WHERE sc.score > 80
  AND ex.is_active = TRUE;
-- with distinc
SELECT DISTINCT st.code,
  st.name
FROM students st
  INNER JOIN scores sc ON st.code = sc.student_code
  INNER JOIN exams ex ON sc.exam_code = ex.code
WHERE sc.score > 80
  AND ex.is_active = TRUE;
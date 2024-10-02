SELECT st.code,
  st.name,
  COUNT(st.code) AS total_exam
FROM students st
  INNER JOIN scores sc ON st.code = sc.student_code
GROUP BY st.code,
  st.name
HAVING COUNT(st.code) > 1;
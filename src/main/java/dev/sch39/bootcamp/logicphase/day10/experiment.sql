-- show average score for student
SELECT st.code,
  st.name,
  AVG(sc.score)::NUMERIC(10, 2) avg_score
FROM students st
  INNER JOIN scores sc ON st.code = sc.student_code
GROUP BY st.code,
  st.name;
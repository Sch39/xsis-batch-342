SELECT st.code,
  st.name,
  sc.score
FROM students st
  LEFT JOIN scores sc ON st.code = sc.student_code;
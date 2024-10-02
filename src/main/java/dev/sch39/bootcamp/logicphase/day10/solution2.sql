SELECT st.code,
  st.name,
  dp.name departmen_name,
  rl.description
FROM students st
  INNER JOIN departments dp ON st.department_code = dp.code
  INNER JOIN religions rl ON st.religion_code = rl.code
WHERE st.code = 'M001';
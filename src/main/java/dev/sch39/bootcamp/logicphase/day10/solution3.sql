SELECT st.code,
  st.name,
  dp.name departmen_name,
  dp.is_active
FROM students st
  LEFT JOIN departments dp ON st.department_code = dp.code
WHERE dp.is_active = FALSE;
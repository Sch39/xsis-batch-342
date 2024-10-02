CREATE VIEW student_detail AS
SELECT st.code,
  st.name,
  dp.name departmen_name,
  rl.description,
  le.name lecture_name,
  dp.is_active is_department_active,
  lt.description lecture_description
FROM students st
  INNER JOIN departments dp ON st.department_code = dp.code
  INNER JOIN religions rl ON st.religion_code = rl.code
  INNER JOIN lecturers le ON dp.code = le.department_code
  INNER JOIN lecturer_types lt ON le.lecturer_type_code = lt.code;
SELECT *
FROM student_detail
WHERE st.code = 'M001';
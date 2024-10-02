INSERT INTO lecturer_types(code, description)
VALUES ('T001', 'Tetap'),
  ('T002', 'Honorer'),
  ('T003', 'Expertise');
INSERT INTO departments(code, name, is_active)
VALUES ('J001', 'Teknik Informatika', TRUE),
  ('J002', 'Management Informatika', TRUE),
  ('J003', 'Sistem Informasi', FALSE),
  ('J004', 'Sistem Komputer', TRUE),
  ('J005', 'Komputer Akuntansi', FALSE);
INSERT INTO lecturers(code, name, department_code, lecturer_type_code)
VALUES (
    'D001',
    'Prof. Dr. Retno Wahyuningsih',
    'J001',
    'T001'
  ),
  ('D002', 'Prof. Roy M. Sutikno', 'J002', 'T001'),
  (
    'D003',
    'Prof. Hendri A. Verburgh',
    'J003',
    'T002'
  ),
  ('D004', 'Prof. Risma Suparwata', 'J004', 'T002'),
  (
    'D005',
    'Prof. AMir Sjarifuddin Madjid, MM, MA',
    'J005',
    'T001'
  );
INSERT INTO religions(code, description)
VALUES ('A001', 'Islam'),
  ('A002', 'Kristen'),
  ('A003', 'Katolik'),
  ('A004', 'Hindu'),
  ('A005', 'Budha');
INSERT INTO students(
    code,
    name,
    address,
    religion_code,
    department_code
  )
VALUES (
    'M001',
    'Budi Gunawan',
    'Jl. Mawar No. 3 RT 05 Cicalengka, Bandung',
    'A001',
    'J001'
  ),
  (
    'M002',
    'Rinto Raharjo',
    'Jl. Kebagusan No. 33 RT 04 RW 06, Bandung',
    'A002',
    'J002'
  ),
  (
    'M003',
    'Asep Saepudin',
    'Jl. Sumatera No. 12 RT 02 RW 01, Ciamis',
    'A001',
    'J003'
  ),
  (
    'M004',
    'M. Hafif Isbullah',
    'Jl. Jawa No. 01 RT 01 RW 01, Jakarta Pusat',
    'A001',
    'J001'
  ),
  (
    'M005',
    'Cahyono',
    'Jl. Niagara No. 54 RT 01 RW 09, Surabaya',
    'A003',
    'J002'
  );
INSERT INTO exams(code, name, is_active)
VALUES ('U001', 'Algoritma', TRUE),
  ('U002', 'Aljabar', TRUE),
  ('U003', 'Statistika', FALSE),
  ('U004', 'Etika Profesi', FALSE),
  ('U005', 'Bahasa Inggris', TRUE);
INSERT INTO scores(student_code, exam_code, score)
VALUES ('M004', 'U001', 90),
  ('M001', 'U001', 80),
  ('M002', 'U003', 85),
  ('M004', 'U002', 95),
  ('M005', 'U005', 70);
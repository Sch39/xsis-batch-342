INSERT INTO biodata(
    first_name,
    last_name,
    dob,
    pob,
    address,
    martial_status
  )
VALUES (
    'Raya',
    'Indriyani',
    '1991-01-01',
    'Bali',
    'Jl. Raya Baru, Bali',
    FALSE
  ),
  (
    'Rere',
    'Wulandari',
    '1992-01-02',
    'Bandung',
    'Jl. Berkah Ramdhan, Bandung',
    FALSE
  ),
  (
    'Bunga',
    'Maria',
    '1991-03-03',
    'Jakarta',
    'Jl. Mawar Semerbak, Bogor',
    TRUE
  ),
  (
    'Natasha',
    'Wulan',
    '1990-04-10',
    'Jakarta',
    'Jl. Mawar Harum, Jakarta',
    FALSE
  ),
  (
    'Zahra',
    'Aurelia Putri',
    '1991-03-03',
    'Jakarta',
    'Jl. Mawar Semerbak, Bogor',
    TRUE
  ),
  (
    'Katniss',
    'Everdeen',
    '1989-01-12',
    'Jakarta',
    'Jl. Bunga Melati, Jakarta',
    TRUE
  );
INSERT INTO employees(biodata_id, nip, status, salary)
VALUES (1, 'NX001', 'Permanen', 12000000),
  (2, 'NX002', 'Kontrak', 15000000),
  (3, 'NX006', 'Kontrak', 69000000),
  (4, 'NX003', 'Permanen', 13500000),
  (5, 'NX004', 'Permanen', 12000000),
  (6, 'NX005', 'Permanen', 17000000);
INSERT INTO contact_persons(biodata_id, type, contact)
VALUES (1, 'MAIL', 'raya.indriyani@gmail.com'),
  (1, 'PHONE', '085612345678'),
  (2, 'MAIL', 'rere.wulandari@gmail.com'),
  (2, 'PHONE', '081312345678'),
  (2, 'PHONE', '087812345678'),
  (3, 'MAIL', 'bunga.maria@gmail.com'),
  (4, 'MAIL', 'natasha.wulan@gmail.com'),
  (5, 'MAIL', 'zahra.putri@gmail.com'),
  (6, 'MAIL', 'katniss.everdeen@gmail.com');
INSERT INTO employee_leaves(employee_id, periode, regular_quota)
VALUES (1, '2020', 16),
  (2, '2020', 12),
  (1, '2021', 16),
  (2, '2021', 12),
  (4, '2021', 12),
  (5, '2021', 12),
  (6, '2021', 12);
INSERT INTO leaves(type, name)
VALUES('Regular', 'Cuti Tahunan'),
  ('Khusus', 'Cuti Menikah'),
  ('Khusus', 'Cuti Haji & Umroh'),
  ('Khusus', 'Melahirkan');
INSERT INTO leave_requests(
    employee_id,
    leave_id,
    start_date,
    end_date,
    reason
  )
VALUES(1, 1, '2020-10-10', '2020-10-12', 'Liburan'),
  (
    1,
    1,
    '2020-11-12',
    '2020-11-15',
    'Acara keluarga'
  ),
  (2, 2, '2020-05-05', '2020-05-07', 'Menikah'),
  (2, 1, '2020-09-09', '2020-09-13', 'Touring'),
  (
    2,
    1,
    '2020-12-24',
    '2020-12-25',
    'Acara keluarga'
  );
INSERT INTO families(biodata_id, name, status)
VALUES(3, 'Azka Fadlan Zikrullah', 'Suami'),
  (3, 'Primrose Everdeen', 'Anak'),
  (5, 'Jaka Samudera Buana', 'Suami'),
  (5, 'Friska Davira', 'Anak'),
  (5, 'Harum Indah Az Zahra', 'Anak'),
  (6, 'Adya Pratama Yuda', 'Suami');
INSERT INTO positions(name)
VALUES('Direktur'),
  ('General Manager'),
  ('Manager'),
  ('Staff');
INSERT INTO employee_positions(employee_id, position_id)
VALUES(5, 1),
  (4, 2),
  (3, 3),
  (2, 4),
  (1, 4);
INSERT INTO travel_types(name, travel_fee)
VALUES('In Indonesia', 200000),
  ('Out Indonesia', 350000);
INSERT INTO travel_requests(
    employee_id,
    travel_type_id,
    start_date,
    end_date
  )
VALUES(1, 1, '2020-07-07', '2020-07-08'),
  (1, 1, '2020-08-07', '2020-08-08'),
  (2, 2, '2020-04-04', '2020-04-07');
INSERT INTO travel_settlements(travel_request_id, item_name, item_cost)
VALUES(1, 'Tiket travel Do car berangkat', 165000),
  (1, 'Hotel', 750000),
  (1, 'Tiket travel Do Car pulang', 165000),
  (2, 'Tiket pesawat berangkat', 750000),
  (2, 'Hotel', 650000),
  (2, 'Tiket pesawat pulang', 1250000),
  (3, 'Tiket pesawat berangkat', 4750000),
  (3, 'Hotel', 6000000),
  (2, 'Tiket pesawat pulang', 4250000);
INSERT INTO departments(name)
VALUES('Recruitment'),
  ('Sales'),
  ('Human Resources'),
  ('General Affair');
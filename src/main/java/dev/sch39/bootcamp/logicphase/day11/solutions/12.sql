INSERT INTO biodata(
    first_name,
    last_name,
    dob,
    pob,
    address,
    martial_status
  )
VALUES (
    'Eliano',
    'Reijnders',
    '2000-06-23',
    'Nganjuk',
    'Jl. Nganjuk timur, Nganjuk',
    FALSE
  ),
  (
    'Mees',
    'Hilgers',
    '2000-01-02',
    'Ngawi',
    'Jl. Berkah Pak Amba, Ngawi',
    FALSE
  ),
  (
    'Towel',
    'Anj',
    '2010-01-02',
    'Malaysia',
    'Jl. Upin, Apin',
    FALSE
  );
INSERT INTO employees(biodata_id, nip, status, salary)
VALUES (7, 'NX007', 'Kontrak', 50000000),
  (8, 'NX008', 'Kontrak', 50000000);
SELECT em.nip,
  em.status,
  CONCAT(bi.first_name, ' ', bi.last_name) fullname,
  em.status,
  em.salary
FROM employees em
  INNER JOIN biodata bi ON em.biodata_id = bi.id;
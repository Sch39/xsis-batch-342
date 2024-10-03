CREATE INDEX IF NOT EXISTS idx_employees_nip ON employees(nip);
EXPLAIN
SELECT *
FROM employees
WHERE nip = 'Null';
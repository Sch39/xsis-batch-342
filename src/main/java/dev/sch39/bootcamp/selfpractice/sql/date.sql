-- SELECT CURRENT_DATE + INTERVAL '1 months 2 days 5 hours 2 minutes 30 seconds';
-- SELECT DATE_TRUNC('minute', NOW())::TIMESTAMP;
SELECT DATE_PART(
    'year',
    AGE('2024-06-01'::DATE, '1999-01-25'::DATE)
  );
SELECT TO_CHAR(NOW(), 'YYYY-MM-DD, HH24:MM:SS');
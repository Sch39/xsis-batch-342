SELECT COUNT(
    CASE
      WHEN bi.martial_status = TRUE THEN 1
    END
  ) married_count,
  COUNT(
    CASE
      WHEN bi.martial_status = FALSE THEN 1
    END
  ) unmarried_count
FROM biodata bi;
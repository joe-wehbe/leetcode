# Write your MySQL query statement below
SELECT MAX(num) AS num FROM (SELECT num FROM MyNumbers GROUP BY num HAVING count(*) = 1) AS unique_values;
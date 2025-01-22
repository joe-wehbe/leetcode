# Write your MySQL query statement below
SELECT u.name, SUM(amount) AS balance 
FROM Users u 
JOIN Transactions t ON u.account = t.account 
GROUP BY u.name
HAVING balance > 10000;


-- account | name | trans_id | account | amount | transacted_on
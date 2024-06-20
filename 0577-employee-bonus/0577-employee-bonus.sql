# Write your MySQL query statement below
SELECT name, (SELECT bonus FROM Bonus WHERE Employee.empId = Bonus.empId) AS bonus
FROM Employee WHERE NOT EXISTS (SELECT 1 FROM Bonus WHERE Employee.empId = Bonus.empId) OR 
(SELECT bonus FROM Bonus WHERE Employee.empId = Bonus.empId) < 1000;

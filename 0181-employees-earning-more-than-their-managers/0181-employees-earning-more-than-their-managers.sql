# Write your MySQL query statement below
SELECT name as Employee FROM Employee WHERE salary > (SELECT salary FROM Employee as manager WHERE manager.id = Employee.managerId);
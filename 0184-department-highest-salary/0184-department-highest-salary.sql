/* Write your PL/SQL query statement below */
SELECT d.name Department,
               e.name Employee,
               e.salary Salary
FROM EMPLOYEE e
JOIN DEPARTMENT d
ON e.departmentId = d.id
WHERE e.salary  IN (
    SELECT max(salary) FROM EMPLOYEE e2
    WHERE e2.departmentId = e.departmentId;
    GROUP BY departmentId 
);
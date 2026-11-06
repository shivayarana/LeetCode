/* Write your PL/SQL query statement below */
SELECT unique_id, name
FROM  Employees Em 
LEFT JOIN EmployeeUNI Emu
ON Em.id = Emu.id;
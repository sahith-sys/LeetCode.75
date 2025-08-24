# Write your MySQL query statement below
SELECT b.employee_id,b.name, count(a.employee_id) as reports_count, ROUND(AVG(a.age),0) as average_age
from Employees a
join Employees b
on a.reports_to = b.employee_id
group by b.employee_id
order by b.employee_id;
# Write your MySQL query statement below
select(SELECT salary from Employee group by salary order by salary DESC limit 1 offset 1) as SecondHighestSalary;
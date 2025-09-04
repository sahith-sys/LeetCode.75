# Write your MySQL query statement below
SELECT user_id,CONCAT(UPPER(LEFT(name,1)),LOWER(SUBSTRING(name,2))) as name
From Users
Order by user_id;
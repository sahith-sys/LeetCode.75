# Write your MySQL query statement below
select ROUND(count(player_id)/(SELECT COUNT(DISTINCT player_id) FROM Activity),2) as fraction
from Activity
where (player_id,event_date) in (SELECT a.player_id,MIN(a.event_date) FROM Activity a LEFT JOIN Activity b on a.player_id = b.player_id where min(a.event_date)-b.event_dateGroup BY player_id)=1;
# Write your MySQL query statement below
select user_id,max(time_stamp) as 'last_stamp'
from logins
where left(time_stamp,4) = '2020'
group by user_id;
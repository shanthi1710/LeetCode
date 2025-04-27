# Write your MySQL query statement below
select a.user_id,round(IFNULL(avg(action = 'confirmed'),0),2) AS confirmation_rate
from Signups as a
left join Confirmations as b on a.user_id = b.user_id
group by a.user_id;
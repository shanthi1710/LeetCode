# Write your MySQL query statement below
select employee_id,if(employee_id%2!=0 and name NOT LIKE 'M%',salary,0) as bonus
from EMployees
order by employee_id ;
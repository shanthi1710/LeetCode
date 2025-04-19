# Write your MySQL query statement below
select a.name,sum(b.amount) as 'balance'
from  Transactions b left join Users a  on a.account = b.account 
group by b.account
having sum(b.amount)>10000;
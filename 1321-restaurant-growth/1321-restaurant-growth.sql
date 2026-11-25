# Write your MySQL query statement below
select DISTINCT visited_on , sum(amount) over(
    order by visited_on range between interval 6 day PRECEDING
    and CURRENT row) 
as amount,
round(sum(amount) over(order by visited_on range between interval 6 day preceding and current row)/7,2) as average_amount
from Customer order by visited_on
limit 10000000 offset 6;
# Write your MySQL query statement below
select name as Customers from Customers c LEFT JOIN orders o on c.id=o.customerId where o.customerId IS NULL;
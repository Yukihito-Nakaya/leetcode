SELECT name as Customers FROM customers WHERE (SELECT COUNT(*) FROM orders WHERE customerId = customers.id) < 1;

#another anser
SELECT name AS Customers FROM Customers c WHERE NOT EXISTS (SELECT o.id from Orders o WHERE o.customerID = c.id)
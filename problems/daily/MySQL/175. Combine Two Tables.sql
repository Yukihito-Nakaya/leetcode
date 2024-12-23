# Write your MySQL query statement below
SELECT p.firstName, p.lastName, a.city, a.state FROM Person p left join Address a ON p.personId = a.personId;

#another anser
SELECT p.firstName, p.lastName, A.city, A.state FROM Person p LEFT JOIN Address A USING (personId);
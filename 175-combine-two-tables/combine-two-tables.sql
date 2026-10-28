# Write your MySQL query statement be
select Person.firstName,Person.lastName ,Address.city,Address.state
from Person 
left join Address On Person.personId=Address.PersonId

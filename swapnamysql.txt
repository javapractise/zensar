CREATE TABLE EMPLOYEE (
  empId INTEGER ,
  name TEXT NOT NULL,
  salary INTEGER PRIMARY KEY,
  dept TEXT NOT NULL
);

-- insert
INSERT INTO EMPLOYEE VALUES (1, 'Clark', 57000,'Sales');
INSERT INTO EMPLOYEE VALUES (2, 'Dave',65000, 'Accounting');
INSERT INTO EMPLOYEE VALUES (3, 'Ava', 45000,'Sales');
INSERT INTO EMPLOYEE VALUES (4, 'RAJ', 75000,'testing');
INSERT INTO EMPLOYEE VALUES (5, 'krish', 85000,'devlope');
INSERT INTO EMPLOYEE VALUES (6, 'leela', 30000,'devlope');
------------------------------------------------------------------
Select * from EMPLOYEE where salary >= 57000 and salary <= 75000;    ----1

empId	name	salary	dept
1	Clark	57000	Sales
2	Dave	65000	Accounting
4	RAJ	75000	testing
-----------------------------------------------------------------------------

Select * from EMPLOYEE order by Salary DESC limit 3,1   ---4th highest salary  2

empId	name	salary	dept
1	Clark	57000	Sales
--------------------------------------------------------------------------------
 SELECT * FROM EMPLOYEE WHERE NAME LIKE 'S%';
 SELECT * FROM EMPLOYEE WHERE NAME LIKE 'k%';
 SELECT * FROM EMPLOYEE WHERE NAME LIKE 'u%'; ---SKU3

empId	name	salary	dept
7	Sushma	40000	devlope
empId	name	salary	dept
5	krish	85000	devlope
empId	name	salary	dept
8	uma	90000	devlope
------------------------------------------------------------------------------
 SELECT * FROM EMPLOYEE WHERE dept is null;   --- NULL4

----------------------------------------------------------------------------
SELECT DISTINCT * FROM EMPLOYEE a 
WHERE 3 >= (SELECT COUNT(DISTINCT salary) 
FROM EMPLOYEE b 
WHERE b.salary >= a.salary) 
ORDER BY a.salary DESC;                              ----6

empId	name	salary	dept
8	uma	90000	devlope
5	krish	85000	devlope
4	RAJ	75000	testing
--------------------------------------------------------------------------------
SELECT name, (salary/12) AS 'Monthly Salary' ,     --------5
salary AS 'Annual Salary' FROM EMPLOYEE ;

name	Monthly Salary	Annual Salary
Clark	4750.0000	57000
Dave	5416.6667	65000
Ava	3750.0000	45000
RAJ	6250.0000	75000
krish	7083.3333	85000
leela	2500.0000	30000
Sushma	3333.3333	40000
uma	7500.0000	90000
Vishnu	5000.0000	60000
----------------------------------------------------------------------------------------------
SELECT *FROM (SELECT *, DENSE_RANK() OVER (ORDER BY salary DESC) AS rk   ----7
  FROM EMPLOYEE) t WHERE rk = 3

empId	name	salary	dept	rk
4	RAJ	75000	testing	3
---------------------------------------------------------------------------------
SELECT  MAX(salary)FROM  EMPLOYEE;                    ----8

MAX(salary)
90000
-----------------------------------------------------------------------------
CREATE TABLE EMPLOYEE (               -----------------------  9
  empId INTEGER ,
  name TEXT,
  salary INTEGER,
  DOJ INTEGER,
  dept TEXT
);
INSERT INTO EMPLOYEE VALUES (1, 'Clark', 57000,2016,'Sales');
INSERT INTO EMPLOYEE VALUES (2, 'Dave',65000, 2022,'Accounting');
INSERT INTO EMPLOYEE VALUES (3, 'Ava', 45000,2017,'Sales');
INSERT INTO EMPLOYEE VALUES (4, 'RAJ', 75000,2016,'testing');
INSERT INTO EMPLOYEE VALUES (5, 'krish', 85000,2018,'devlope');
INSERT INTO EMPLOYEE VALUES (6, 'leela', 30000,2019,'devlope');
INSERT INTO EMPLOYEE VALUES (7, 'Sushma', 40000,2020,'devlope');
INSERT INTO EMPLOYEE VALUES (8, 'uma', 90000,2016,'devlope');
INSERT INTO EMPLOYEE VALUES (9, 'Vishnu', 10000,2015, ' ');


SELECT * FROM EMPLOYEE WHERE DOJ = 2016 and Salary >= 10000


empId	name	salary	DOJ	dept
1	Clark	57000	2016	Sales
4	RAJ	75000	2016	testing
8	uma	90000	2016	devlope
------------------------------------------------------------------------------------
select dept, COUNT(dept)                  ----------------11
FROM
    EMPLOYEE
GROUP BY dept
HAVING COUNT(dept) > 1;



CREATE TABLE Students (
  StudentID INTEGER ,
  Student_Name TEXT ,
  Student_Age INTEGER,
  Student_Address TEXT
);

insert into Students Values (101,'Swapna',25,'Tirupathi');
insert into Students Values (102,'Teja',26,'Pallipattu');

select * from Students

update Students set Student_Age=30 where StudentID=102

DELETE FROM Students WHERE StudentID=101;

Alter TABLE Students modify column Student_Address City

DROP TABLE Students;



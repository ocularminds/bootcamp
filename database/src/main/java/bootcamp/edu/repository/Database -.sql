Database - 
  RDMS - relational database ACID - Atomicity, Data Integrity
  NoSQL - Unstructured database, 
  In-Memory - database tinysql, h2
SQL
Jdbc
Database - Oracle, MySQL, Postgres, MSSQL, Sybase,
NoSQL - Cassandra, MongoDb, DynamoDb(Amazon), Redis
H2, Java

Database->Tables-> Rows and Columns[attributes]
Java ->   Class -> Collections -> Properties
Database  Table -> Columns -> Key
key -> Primary, Foreign Key, Composite Key

Primary Key - Single unique reference identifier
Foreign Key - Primary key of a dependence object
Student id, address id(foreign key)
Address id.

student_courses
student_id, course_id -> composite id
multiple -> course id

data types -> string, integer, float 
char -> single character
vachar -> String
int -> int
Date
clob - character large object
blob - binary large object
timestamp > date with time up till day, month, year, hr, min, sec, mill

SQL - Structured Query Language

SELECT - Query and fetch or reading SELECT id, name, address_id FROM students;
UPDATE - update data                UPDATE students SET name='Baoba';
DELETE - delete record from table   DELETE from students; TRUNCATE
CREATE - to create a new table,     CREATE table(table columns defination)
INSERT - add new record to a table  INSERT 

DROP - Delete the entire table or   DROP COLUMN name from Students
TRUNCATE - remove all records with logical spaces
GRANT - Grant permission or access rights to a user or role

Collection Maintenance - CREATE, DROP, ALTER
Record Manipulation    - INSERT, SELECT, UPDATE, DELETE

https://www.devart.com/dbforge/mysql/how-to-install-mysql-on-macos/

1. show databases;
2. create database bootcamp;
3. use bootcamp;
4. create table addresses(id int, street varchar(30), city varchar(75), state varchar(75));
4. create table students(id int primary key, name varchar(30), address_id int, FOREIGN KEY(id) REFERENCES addresses(address_id));
6.

insert into addresses(id, street, city, state) values(1, 'Teststore 1','Ontario', 'CA');
insert into students(id, name, address_id) values(1, 'Donal Bello', 1);

insert into addresses(id, street, city, state) values(2, 'London Avenue 1','Ontario', 'CA');
insert into students(id, name, address_id) values(2, 'Tope Samson',2);

insert into addresses(id, street, city, state) values(3, 'Teststore 23','Johnsons', 'GA');
insert into students(id, name, address_id) values(3, 'Jake Kirk', 3);
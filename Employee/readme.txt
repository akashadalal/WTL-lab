table name = emp 

+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| id    | int(11)     | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | NO   |     | NULL    |                |
| age   | int(2)      | NO   |     | NULL    |                |
| city  | varchar(10) | NO   |     | NULL    |                |
+-------+-------------+------+-----+---------+----------------+
CREATE TABLE emp ( id INT(10) NOT NULL AUTO_INCREMENT , name VARCHAR(10) NOT NULL , age INT(3) NOT NULL ,city VARCHAR(10) NOT NULL , PRIMARY KEY (id)) ;
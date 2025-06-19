CREATE DATABASE tasks;
USE tasks;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    mark INT,
    department VARCHAR(50),
    sections VARCHAR(10)
);

INSERT INTO student (id, name, mark, department, sections) VALUES
(1, 'merin', 95, 'CT', 'A'),
(2, 'abinaya', 57, 'IT', 'B'),
(3, 'farhan', 75, 'BCA', 'A');

UPDATE student SET name = 'vaehan' WHERE id = 1;

SELECT * FROM student WHERE mark < 60;
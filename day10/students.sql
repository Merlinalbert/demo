CREATE DATABASE  school;
USE school;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    section VARCHAR(10),
    marks INT
);

INSERT INTO students (name, department, section, marks) VALUES
('Alice', 'Computer Science', 'A', 85),
('Bob', 'Electrical', 'B', 78),
('Charlie', 'Mechanical', 'A', 92),
('Diana', 'Civil', 'C', 88),
('Ethan', 'Computer Science', 'B', 79);

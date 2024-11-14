CREATE DATABASE db_escuela;
USE db_escuela;

CREATE TABLE Alumnos(
id int not null auto_increment primary key,
nombres VARCHAR(70)not null,
apellidos VARCHAR(80)not null
);

select * from Alumnos;

INSERT INTO Alumnos (nombres, apellidos) value ('Frank', 'Jacinto');


UPDATE Alumnos SET nombres = 'Francisco', apellidos = 'Vargas' WHERE Alumnos.id = 1;


DELETE FROM Alumnos WHERE Alumnos.id=2;

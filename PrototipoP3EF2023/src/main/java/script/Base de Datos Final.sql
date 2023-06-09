use cinevision;

SELECT * FROM tbl_clientes;
SELECT * FROM tblusuarios;
SELECT * FROM cinevision.cursos;

/*DROP TABLE cursos;*/

CREATE TABLE cursos
(
  codigo_curso INT NOT NULL AUTO_INCREMENT,
  nombre_curso VARCHAR(45),
  estatus_curso VARCHAR(1),
  PRIMARY KEY (codigo_curso)
 ) ENGINE = InnoDB DEFAULT CHARSET=latin1;
 
 CREATE TABLE alumnos
 (
  carnet_alumno VARCHAR(15),
  nombre_alumno VARCHAR(45),
  direccion_alumno VARCHAR(45),
  telefono_alumno VARCHAR(45),
  email_alumno VARCHAR(20),
  estatus_alumno VARCHAR(1),
  PRIMARY KEY (carnet_alumno)
) ENGINE = InnoDB DEFAULT CHARSET=latin1;

SELECT * FROM alumnos;

insert into alumnos values('9959','Gabriela','zona 17','5236555','mg@gmail.com','T');
insert into alumnos values('9958','Juan','zona 6','65415648','juan@','T');
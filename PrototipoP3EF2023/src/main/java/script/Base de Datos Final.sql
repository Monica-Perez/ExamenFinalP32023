use cinevision;

SELECT * FROM tbl_clientes;
SELECT * FROM tblusuarios;

CREATE TABLE cursos
(
  codigo_curso int,
  nombre_curso VARCHAR(45),
  estatus_curso VARCHAR(1),
  PRIMARY KEY (codigo_curso)
 ) ENGINE = InnoDB DEFAULT CHARSET=latin1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsAlumnos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class daoAlumnos {
    private static final String SQL_SELECT = "SELECT carnet_alumno, nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno FROM alumnos ";
    private static final String SQL_INSERT = "INSERT INTO alumnos(nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cursos SET nombre_alumno=?, direccion_alumno=?, telefono_alumno=?, email_alumno=?, estatus_alumno=? WHERE codigo_curso = ?";
    private static final String SQL_DELETE = "DELETE FROM cursos WHERE carnet_alumno=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT carnet_alumno, nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno FROM cursos WHERE nombre_alumno = ?";
    private static final String SQL_SELECT_ID = "SELECT carnet_alumno, nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno FROM cursos WHERE carnet_alumno = ?";    

    /*public List<clsAlumnos> consultaAplicacion() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsAlumnos> alumnos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("codigo_curso");
                String nombre = rs.getString("nombre_curso");
                String nit = rs.getString("estatus_curso");
                clsAlumnos alumno = new clsAlumnos();
                alumno.setIdAlumno(id);
                alumno.setNombreAlumno(nombre);
                alumno.setEstatusAlumno(nit);
                alumnos.add(alumno);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return alumnos;
    }*/

}

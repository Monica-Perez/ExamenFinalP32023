/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.daoAlumnos;
import modelo.daoCursos;
/**
 *
 * @author Usuario
 */
public class clsAlumnos {
    private int IdAlumno;
    private String NombreAlumno;
    private String DireccionAlumno;
    private String TelefonoAlumno;
    private String EmailAlumno;
    private String EstatusAlumno;

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public void setNombreAlumno(String NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public void setDireccionAlumno(String DireccionAlumno) {
        this.DireccionAlumno = DireccionAlumno;
    }

    public void setTelefonoAlumno(String TelefonoAlumno) {
        this.TelefonoAlumno = TelefonoAlumno;
    }

    public void setEmailAlumno(String EmailAlumno) {
        this.EmailAlumno = EmailAlumno;
    }

    public void setEstatusAlumno(String EstatusAlumno) {
        this.EstatusAlumno = EstatusAlumno;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public String getNombreAlumno() {
        return NombreAlumno;
    }

    public String getDireccionAlumno() {
        return DireccionAlumno;
    }

    public String getTelefonoAlumno() {
        return TelefonoAlumno;
    }

    public String getEmailAlumno() {
        return EmailAlumno;
    }

    public String getEstatusAlumno() {
        return EstatusAlumno;
    }

    public clsAlumnos(int IdAlumno, String NombreAlumno, String DireccionAlumno, String TelefonoAlumno, String EmailAlumno, String EstatusAlumno) {
        this.IdAlumno = IdAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
        this.TelefonoAlumno = TelefonoAlumno;
        this.EmailAlumno = EmailAlumno;
        this.EstatusAlumno = EstatusAlumno;
    }

    public clsAlumnos(int IdAlumno, String NombreAlumno, String DireccionAlumno, String TelefonoAlumno, String EmailAlumno) {
        this.IdAlumno = IdAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
        this.TelefonoAlumno = TelefonoAlumno;
        this.EmailAlumno = EmailAlumno;
    }

    public clsAlumnos(int IdAlumno, String NombreAlumno, String DireccionAlumno, String TelefonoAlumno) {
        this.IdAlumno = IdAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
        this.TelefonoAlumno = TelefonoAlumno;
    }

    public clsAlumnos(int IdAlumno, String NombreAlumno, String DireccionAlumno) {
        this.IdAlumno = IdAlumno;
        this.NombreAlumno = NombreAlumno;
        this.DireccionAlumno = DireccionAlumno;
    }

    public clsAlumnos(int IdAlumno, String NombreAlumno) {
        this.IdAlumno = IdAlumno;
        this.NombreAlumno = NombreAlumno;
    }

    public clsAlumnos(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public clsAlumnos() {
    }
    
    /*public List<clsAlumnos> getListadoAplicaciones(){
        daoCursos daoAlumnos = new daoCursos();
        List<clsAlumnos> listadoUsuarios = daoAlumnos.consultaAplicacion();
        return listadoUsuarios;
    }*/
    
}

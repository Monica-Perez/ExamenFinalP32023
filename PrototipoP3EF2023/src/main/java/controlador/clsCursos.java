/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.daoCursos;

/**
 *
 * @author Usuario
 */
public class clsCursos {

    private int IdCurso;
    private String NombreCurso;
    private String Estatus;

    public void setIdCurso(int IdCurso) {
        this.IdCurso = IdCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public int getIdCurso() {
        return IdCurso;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public String getEstatus() {
        return Estatus;
    }

    public clsCursos(int IdCurso, String NombreCurso, String Estatus) {
        this.IdCurso = IdCurso;
        this.NombreCurso = NombreCurso;
        this.Estatus = Estatus;
    }

    public clsCursos(int IdCurso, String NombreCurso) {
        this.IdCurso = IdCurso;
        this.NombreCurso = NombreCurso;
    }

    public clsCursos(int IdCurso) {
        this.IdCurso = IdCurso;
    }

    public clsCursos() {
    }

    
    
    //Metodos de acceso a la capa controlador
    public clsCursos getBuscarInformacionAplicacionPorNombre(clsCursos aplicacion)
    {
        daoCursos daoAplicacion = new daoCursos();
        return daoAplicacion.consultaAplicacionPorNombre(aplicacion);
    }
    public clsCursos getBuscarInformacionAplicacionPorId(clsCursos aplicacion)
    {
        daoCursos daoAplicacion = new daoCursos();
        return daoAplicacion.consultaAplicacionPorId(aplicacion);
    }    
    public List<clsCursos> getListadoAplicaciones()
    {
        daoCursos daoAplicacion = new daoCursos();
        List<clsCursos> listadoUsuarios = daoAplicacion.consultaAplicacion();
        return listadoUsuarios;
    }
    public int setBorrarAplicacion(clsCursos aplicacion)
    {
        daoCursos daoAplicacion = new daoCursos();
        return daoAplicacion.borrarAplicacion(aplicacion);
    }          
    public int setIngresarAplicacion(clsCursos aplicacion)
    {
        daoCursos daoAplicacion = new daoCursos();
        return daoAplicacion.ingresaAplicacion(aplicacion);
    }              
    public int setModificarAplicacion(clsCursos aplicacion)
    {
        daoCursos daoAplicacion = new daoCursos();
        return daoAplicacion.actualizaAplicacion(aplicacion);
    }              

}

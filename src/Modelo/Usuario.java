/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Usuarios.FormUsuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaNacimiento;
    private Boolean sexoMasculino;
    private String nacionalidad;
    private String descripcion;
    private List<String> apariencias;

    public Usuario(String nombre, String apellido1, String apellido2, Date fechaNacimiento, Boolean sexoMasculino, String nacionalidad, String descripcion, List<String> apariencias) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.sexoMasculino = sexoMasculino;
        this.nacionalidad = nacionalidad;
        this.descripcion = descripcion;
        this.apariencias = apariencias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getApariencias() {
        return apariencias;
    }

    public void setApariencias(List<String> apariencias) {
        this.apariencias = apariencias;
    }

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Boolean getSexoMasculino() {
        return sexoMasculino;
    }

    public void setSexoMasculino(Boolean sexoMasculino) {
        this.sexoMasculino = sexoMasculino;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String[] toArrayList() {

        String[] s = new String[8];
        s[0] = nombre;
        s[1] = apellido1;
        s[2] = apellido2;

        if (FormUsuario.mostrarFecha == false) {
            s[3] = "";
        } else {
            s[3] = sdf.format(fechaNacimiento);

        }

        s[4] = sexoMasculino.toString();
        s[5] = nacionalidad;
        s[6] = descripcion;
        s[7] = " ";
        for (int i = 0; i < apariencias.size(); i++) {
            if (i < apariencias.size() - 1) {
                s[7] += apariencias.get(i) + ", ";

            } else {
                s[7] += apariencias.get(i);
            }
        }
        return s;
    }

}

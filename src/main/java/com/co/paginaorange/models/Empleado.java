package com.co.paginaorange.models;

public class Empleado {
    private String nombre;
    private String segundoNombre;
    private String apellido;

    // Constructor vació (obligatorio para cucumber)
    public Empleado(){}

    // Constructor completo
    public Empleado(String nombre, String segundoNombre, String apellido){
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getSegundoNombre(){
        return  segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre){
        this.segundoNombre = segundoNombre;
    }

    public String getApellido(){return apellido;}
    public void setApellido(String apellido) { this.apellido = apellido;}
}

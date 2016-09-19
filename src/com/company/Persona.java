package com.company;

/**
 * Created by usu26 on 19/09/2016.
 */
public class Persona {

    private String dni;
    private String numSS;
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;

    public Persona(String dni, String numSS, String nombre, String apellidos, int edad, double salario) {
        this.dni = dni;
        this.numSS = numSS;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        return numSS != null ? numSS.equals(persona.numSS) : persona.numSS == null;

    }

}

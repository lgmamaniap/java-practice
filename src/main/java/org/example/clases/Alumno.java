package org.example.clases;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;

    public Alumno() {}

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Metodos
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public void saberAprobado(double calificacion) {
        if (calificacion > 50) {
            System.out.println("Aprobado");
            return;
        }

        System.out.println("Reprobado");
    }
}

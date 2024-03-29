package org.example.herencia;

public class Persona {
  private int id;
  private String dni;
  private String nombre;
  private String apellido;
  private String domicilio;
  private String telefono;

  public Persona() {}

  public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
    this.id = id;
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.domicilio = domicilio;
    this.telefono = telefono;
  }

  // Getters y setters
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDni() {
    return this.dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
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

  public String getDomicilio() {
    return this.domicilio;
  }

  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}

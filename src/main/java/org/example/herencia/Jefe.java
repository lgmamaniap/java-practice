package org.example.herencia;

public class Jefe extends Persona {
  private int id_jefe;
  private String departamento_jefe;

  public Jefe() {}

  public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int id_jefe, String departamento_jefe) {
    super(id, dni, nombre, apellido, domicilio, telefono);
    this.id_jefe = id_jefe;
    this.departamento_jefe = departamento_jefe;
  }

  // Getters y setters
  public int getId_jefe() {
    return this.id_jefe;
  }

  public void setId_jefe(int id_jefe) {
    this.id_jefe = id_jefe;
  }

  public String getDepartamento_jefe() {
    return this.departamento_jefe;
  }

  public void setDepartamento_jefe(String departamento_jefe) {
    this.departamento_jefe = departamento_jefe;
  }
}

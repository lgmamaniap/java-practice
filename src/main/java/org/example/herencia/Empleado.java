package org.example.herencia;

public class Empleado extends Persona {
  private int num_legajo;
  private String cargo;
  private Double sueldo;

  public Empleado() {}

  public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int num_legajo, String cargo, Double sueldo) {
    super(id, dni, nombre, apellido, domicilio, telefono);
    this.num_legajo = num_legajo;
    this.cargo = cargo;
    this.sueldo = sueldo;
  }

  // Getters y setters
  public int getNum_legajo() {
    return this.num_legajo;
  }

  public void setNum_legajo(int num_legajo) {
    this.num_legajo = num_legajo;
  }

  public String getCargo() {
    return this.cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public Double getSueldo() {
    return this.sueldo;
  }

  public void setSueldo(Double sueldo) {
    this.sueldo = sueldo;
  }
}

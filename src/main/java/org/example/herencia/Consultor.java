package org.example.herencia;

public class Consultor extends Persona {
  private String nombre_consultora;
  private int num_consultor;

  public Consultor() {}

  public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String nombre_consultora, int num_consultor) {
    super(id, dni, nombre, apellido, domicilio, telefono);
    this.nombre_consultora = nombre_consultora;
    this.num_consultor = num_consultor;
  }

  // Getters y setters
  public String getNombre_consultora() {
    return this.nombre_consultora;
  }

  public void setNombre_consultora(String nombre_consultora) {
    this.nombre_consultora = nombre_consultora;
  }

  public int getNum_consultor() {
    return this.num_consultor;
  }

  public void setNum_consultor(int num_consultor) {
    this.num_consultor = num_consultor;
  }
}

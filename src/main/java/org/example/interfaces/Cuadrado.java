package org.example.interfaces;

public class Cuadrado implements Figura, Dibujable {
  private double lado;

  public Cuadrado(double lado) {
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    return Math.pow(lado, 2);
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando un cuadrado");
  }

}

package org.example.interfaces;

public class Circulo implements Figura, Dibujable, Rotable{
  private double radio;

  public Circulo(double radio) {
    this.radio = radio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * Math.pow(radio, 2);
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando un círculo");
  }

  @Override
  public void rotar() {
    System.out.println("Rotando un círculo");
  }
}

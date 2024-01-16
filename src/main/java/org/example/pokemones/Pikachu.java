package org.example.pokemones;

public class Pikachu extends Pokemon implements IElectrico {

  public Pikachu () {}

  @Override
  public void atacarImpacTrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque Impac Trueno");
  }

  @Override
  public void atacarPunioTrueno() {
    System.out.println("Hola soy Pikachu y este es mi ataque Puño Trueno");
  }

  @Override
  protected void atacarPlacaje() {
    System.out.println("Hola soy Pikachu y este es mi ataque Placaje");
  }

  @Override
  protected void atacarAraniazo() {
    System.out.println("Hola soy Pikachu y este es mi ataque Arañazo");
  }

  @Override
  protected void atacarMordisco() {
    System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");
  }
}

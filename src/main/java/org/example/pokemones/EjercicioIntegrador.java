package org.example.pokemones;

public class EjercicioIntegrador {

  public void ejecutarPoderes() {
    Squirtle squirtle = new Squirtle();
    Charmander charmander = new Charmander();
    Bulbasur bulbasur = new Bulbasur();
    Pikachu pikachu = new Pikachu();

    squirtle.atacarAraniazo();
    squirtle.atacarHidrobomba();

    charmander.atacarAraniazo();
    charmander.atacarLanzallamas();

    bulbasur.atacarAraniazo();
    bulbasur.atacarDrenaje();

    pikachu.atacarAraniazo();
    pikachu.atacarImpacTrueno();
  }

}

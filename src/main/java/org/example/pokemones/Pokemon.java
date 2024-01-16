package org.example.pokemones;

public abstract class Pokemon {

  protected int num_pokedex;
  protected String nombre;
  protected double peso;
  protected String sexo;
  protected int temporada;

  protected abstract void atacarPlacaje ();

  protected abstract void atacarAraniazo ();

  protected abstract void atacarMordisco ();

}

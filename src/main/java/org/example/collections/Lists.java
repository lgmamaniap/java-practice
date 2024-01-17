package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

  public Lists () {}

  public void ejemplos () {
    // Declarar un array list
    List<Persona> lista = new ArrayList<Persona>();

    lista.add(new Persona(1, "Juan", 20));
    lista.add(new Persona(2, "Gabriel", 30));
    lista.add(new Persona(3, "Ibra", 9));
    lista.add(new Persona(4, "NombrePrueba", 2));

    // Recorrer por índice
    System.out.println("-------------------FOR-------------------");
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i).getNombre());
    }

    // Recoress con for each
    System.out.println("-------------------FOR EACH-------------------");
    for (Persona persona : lista) {
      System.out.println(persona.getNombre());
    }
  }
}

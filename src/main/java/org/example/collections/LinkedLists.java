package org.example.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

  public LinkedLists () {}

  public void ejemplos () {
    // Declarar un array list
    List<Persona> lista = new LinkedList<>();

    lista.add(new Persona(1, "Juan", 20));
    lista.add(new Persona(2, "Gabriel", 30));
    lista.add(new Persona(3, "Ibra", 9));
    lista.add(new Persona(4, "NombrePrueba", 2));

    lista.addFirst(new Persona(5, "NombrePrueba2", 2));

    // Recoress con for each
    System.out.println("-------------------FOR EACH-------------------");
    for (Persona persona : lista) {
      System.out.println(persona.getNombre());
    }
  }
}

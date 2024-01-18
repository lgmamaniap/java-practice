package org.example.collections;

import java.util.Stack;

public class Stacks {
  public Stacks() {}

  public void ejemploStacks() {
    Stack<Integer> pila = new Stack<Integer>();

    System.out.println("La pila: " + pila);
    System.out.println("La pila esta vacia? " + pila.empty());

    pila.push(2);
    pila.push(1);
    pila.push(3);
    pila.push(20);
    pila.push(10);

    System.out.println("La pila: " + pila);

    for (Integer elemento : pila) {
      System.out.println("Elemento: " + elemento);
    }

    // mostrar
    System.out.println("La pila: " + pila);
    System.out.println("La pila esta vacia? " + pila.empty());

    // eliminar el último elemento
    pila.pop();
    System.out.println("La pila: " + pila);

    //buscar un elemento en la pila
    System.out.println("El elemento 20 esta en la pila? " + pila.search(20));

    // Ver el último elemento agregado a la pila
    System.out.println("El último elemento agregado a la pila es: " + pila.peek());
  }
}

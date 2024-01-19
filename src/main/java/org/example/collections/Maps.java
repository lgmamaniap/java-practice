package org.example.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
  public Maps () {}

  public void ejemploMaps() {
    Map<Integer, String> mapaEmpleados = new HashMap<>();

    mapaEmpleados.put(1, "Juan");
    mapaEmpleados.put(2, "Maria");
    mapaEmpleados.put(3, "Pedro");
    mapaEmpleados.put(4, "Jose");

    System.out.println("El nombre del empleado con id 1 es: " + mapaEmpleados.get(1));

    if (mapaEmpleados.containsKey(2)) {
      System.out.println("El nombre del empleado con id 2 es: " + mapaEmpleados.get(2));
    }

    if (mapaEmpleados.get(10) == null) {
      System.out.println("No existe el empleado con id 10");
    }

    // Eliminando un elemento del mapa
    mapaEmpleados.remove(3);

    if (mapaEmpleados.get(3) == null) {
      System.out.println("No existe el empleado con id 3");
    }
  }
}

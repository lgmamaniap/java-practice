package org.example;

import org.example.clases.Alumno;
import org.example.herencia.Consultor;
import org.example.herencia.Empleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(1, "Juan", "Perez");

        System.out.println("La id del alumno 2 es: " + alumno2.getId());
        System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido());

        // Asignando valores a alumno1
        alumno1.setId(2);
        alumno1.setNombre("Maria");
        alumno1.setApellido("Lopez");

        System.out.println("--------------------");
        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());

        // Modificando valores de alumno1
        alumno1.setId(3);
        alumno1.setNombre("Pedro");
        alumno1.setApellido("Gomez");

        System.out.println("--------------------");
        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());

        Empleado empleado = new Empleado();
        System.out.println("--------------------");
        System.out.println("La id del empleado es: " + empleado.getId());
        System.out.println("El nombre del empleado es: " + empleado.getNombre());

        Consultor consultor = new Consultor();
        System.out.println("--------------------");
        System.out.println("La id del consultor es: " + consultor.getId());
        System.out.println("El nombre del consultor es: " + consultor.getNombre());

    }
}
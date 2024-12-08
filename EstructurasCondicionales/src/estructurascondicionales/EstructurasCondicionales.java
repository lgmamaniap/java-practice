package estructurascondicionales;

import java.util.Scanner;

public class EstructurasCondicionales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Estructura condicional if
        int numero1, numero2;
        
        System.out.println("Ingrese el numero uno: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese el numero dos: ");
        numero2 = teclado.nextInt();
        
        if (numero1 == numero2) {
            System.out.printf("Los números ingresados son iguales%n");
        } else if (numero1 > numero2) {
            System.out.printf("El número %d es mayor%n", numero1);
        } else {
            System.out.printf("El número %d es mayor%n", numero2);
        }
        
    }
    
}

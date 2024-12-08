package estructurascondicionales;

import java.util.Scanner;

public class EstructurasCondicionales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Estructura condicional if
        int numero1, numero2;
        
        System.out.println("Enter the number one: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Enter the number two: ");
        numero2 = teclado.nextInt();
        
        if (numero1 == numero2) {
            System.out.printf("The numbers entered are equals%n");
        } else if (numero1 > numero2) {
            System.out.printf("The number %d is greater%n", numero1);
        } else {
            System.out.printf("The number %d is greater%n", numero2);
        }
        
        // Estructura condicional switch
        switch (numero1) {
            case 1:
                System.out.println("The number one entered is 1");
                break;
            case 2:
                System.out.println("The number one entered 2");
                break;
            case 3:
                System.out.println("The number one entered 3");
                break;
        }
        
        boolean mayorDiez = numero1 > 10;
        if (mayorDiez) {
            System.out.println("The number one is greater than 10");
        } else {
            System.out.println("The number one is less or equal than 10");
        }
        
    }
    
}

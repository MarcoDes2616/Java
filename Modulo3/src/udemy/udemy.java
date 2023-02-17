package udemy;

import java.util.Scanner;

public class udemy {
    public static void main(String[] args) {
       String nombre;

       Scanner entrada = new Scanner(System.in);

       System.out.println("Ingresa tu nombre");

       nombre = entrada.nextLine();

       System.out.println("Hola " + nombre + " como estas?");
    }
}

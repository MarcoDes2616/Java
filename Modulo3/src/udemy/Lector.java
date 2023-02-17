package udemy;

import java.util.Scanner;

public class Lector {
    public static void main(String[] args) {
        String persona, persona_2;
        int edad, edad2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        persona = entrada.nextLine();
        System.out.println("Ingresa el nombre de tu perro");
        persona_2 = entrada.nextLine();
        System.out.println("Ingresa tu Edad");
        edad = entrada.nextInt();
        System.out.println("Ingresa Edad de tu perro");
        edad2 = entrada.nextInt();

        System.out.println("Hola " + persona +". Tienes " + edad + " años de edad. Tienes un perro de nombre " + persona_2 + " que tiene " + edad2 + "años");
    }
}

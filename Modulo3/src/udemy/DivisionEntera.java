package udemy;

import java.util.Scanner;

public class DivisionEntera {

    // separar un numero entero en sus digitos

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCuatroCifras;
        int n1, n2, n3, n4;

        System.out.println("Ingrese un numero de 4 cifras: ");
        numeroCuatroCifras = entrada.nextInt();

        n4 = numeroCuatroCifras % 10;
        n3 = (numeroCuatroCifras / 10) % 10;
        n2 = (numeroCuatroCifras / 100) % 10;
        n1 = (numeroCuatroCifras / 1000) % 10;

        System.out.println(n1 +" y "+ n2 + " y "+ n3 + " y " + n4);

    }
}

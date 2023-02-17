package udemy;

import java.util.Scanner;

public class CalculosSimples {
    public static void main(String[] args) {
        int largo;
        int ancho;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el largo del rectangulo: ");
        largo = entrada.nextInt();
        System.out.println("Ingresa el ancho del rectangulo: ");
        ancho = entrada.nextInt();

        System.out.println("El area del rectangulo es " + ancho * largo + " y su perímetro es " + ((ancho + largo) * 2) + ".");
    }
}

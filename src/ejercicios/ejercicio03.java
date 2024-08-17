package ejercicios;

import java.util.Scanner;

public class ejercicio03 {
    public static void main (String[] args) {
        /*
        Guillermo tiene N dolares, Luis tiene la mitad de Guillermo.
        Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.

        Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3.
         */

        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Cuanto dinero tiene guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo /2;
        juan = (guillermo + luis)/2;


        total = guillermo + luis + juan;

        System.out.println("La cantidad de dinero entre los 3 es de: $ "+total);


    }
}

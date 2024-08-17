package ejercicios;

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        // Crear un porgrama que calcule e imprima la suma de tres calificaciones

        Scanner entrada = new Scanner(System.in);

        float nota_1, nota_2, nota_3;

        // Guardamos las 3 notas
        System.out.println("Digite 3 Calificaciones");
        nota_1 = entrada.nextFloat();
        nota_2 = entrada.nextFloat();
        nota_3 = entrada.nextFloat();

        float suma = nota_1+nota_2+nota_3;

        System.out.println("\nLa suma es: "+suma);

    }
}

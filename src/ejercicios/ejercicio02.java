package ejercicios;

import java.util.Scanner;

public class ejercicio02 {
    public static void main (String[] args){
        // Crear un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario por hora.

        Scanner horasTrabajadas = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        double horasLaboradas = horasTrabajadas.nextInt();

        double salario = 1462000;
        double salarioHora = Math.round(((salario / 30) / 8));

        double salarioTotal = salarioHora * horasLaboradas;

        System.out.println("\nSu Salario de esta semana es de: $ "+salarioTotal);
    }
}

import java.util.Scanner;

public class operadoresArimeticos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, division, resto;
        System.out.println("Digite 2 numeros: ");

        numero1 = entrada.nextFloat(); // Este codigo permite capturar los valores que se le asignan a la variable por entrada de teclado
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La Multiplicacion es: "+mult);
        System.out.println("La Division es: "+division);
        System.out.println("El resto es: "+resto);
    }
}

import java.util.Scanner;

public class entradaSalidaDatos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double numero;

        // System.out.println("Digite un numero: ");
        // numero = entrada.nextInt(); Guardar entrada de tipo Entero
        // numero = entrada.nextFloat(); Guardar entrada de tipo Flotante
        // numero = entrada.nextDouble(); Guardar entrada de tipo Double

        String cadena;
        // System.out.println("Digite una cadena: ");
        // cadena = entrada.next(); Guarda la cadena hasta el primer espacio que encuentre
        // cadena = entrada.nextLine(); Guarda la cadena completa

        char letra;
        System.out.println("Digite una letra: ");
        letra=entrada.next().charAt(0);

        System.out.println("La Letra es: "+letra);

    }
}

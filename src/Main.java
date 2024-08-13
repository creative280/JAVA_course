public class Main {
    public static void main(String[] args) {
        // TIPOS DE DATOS PRIMITIVOS

        // Byte: Desde -128 a 127
        byte enteroByte = 24;
        System.out.println("Numero Byte: "+enteroByte);

        // Short: Desde -32768 a 32767
        short enteroShort = 12456;
        System.out.println("Numero Short: "+enteroShort);

        // int: Desde -2,174,483,648 a 2,147,483,647
        int enteroInt = 1245689;
        System.out.println("Numero Int: "+enteroInt);

        // long: Desde -9,223,372,036,854,775,808 a 9,223,372,854,775,807
        long enteroLong = 316651619;
        System.out.println("Numero Long: "+enteroLong);

        // float: para que se tome correctamente el valor debemos agregarle una f al final
        float decimalFloat = 3.45f;
        System.out.println("Numero decimal float: "+decimalFloat);

        // Double: se usa para indicarle al programa que el valor es un decimal sin usar la F al final. (CONTRA: Ocupa mucho espacio en memoria 64 bits)
        double decimalDouble = 3.4516;
        System.out.println("Numero decimal double: "+decimalDouble);

        // char: Todas las teclas dispoinibles que puedo oprimir
        char caracter = 'a';
        System.out.println("Caracter: " + caracter);

        // boolean: true or false
        boolean decision = true;
        System.out.println("la decision es: "+decision);

        // TIPOS DE DATOS NO PRIMITIVOS Y CADENAS (almacenan null)

        Integer numeroNull = null;
        System.out.println("El numero null: " + numeroNull);

        // CADENAS
        String palabra = "Alejandro Taborda Sepulveda";
        System.out.println("La palabra es: "+palabra);
    }
}
import javax.swing.*;

public class JOptionsPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        // ENTRADA DE DATOS POR PANTALLA

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite una decimal: "));


        // SALIDA DE DATOS POR PANTALLA
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);

    }
}

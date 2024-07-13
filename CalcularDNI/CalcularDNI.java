import javax.swing.JOptionPane;

public class CalcularDNI {
    public static void main(String[] args) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        while (true) {
            String input = JOptionPane.showInputDialog("Introduce tu número de DNI (0-99999999) o pulsa Cancelar para salir:");
            if (input == null) {
                break;
            }
            
            try {
                int dni = Integer.parseInt(input);
                if (dni >= 0 && dni <= 99999999) {
                    int resto = dni % 23;
                    char letra = letras.charAt(resto);
                    JOptionPane.showMessageDialog(null, "La letra de tu DNI es: " + letra);
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre 0 y 99999999.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
            }
        }
    }
}

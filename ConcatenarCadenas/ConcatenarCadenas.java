import javax.swing.JOptionPane;

public class ConcatenarCadenas {
    public static void main(String[] args) {
        StringBuilder cadenas = new StringBuilder();
        String input;
        
        while (true) {
            input = JOptionPane.showInputDialog("Introduce una cadena (o pulsa Cancelar para terminar):");
            if (input == null) {
                break;
            }
            if (cadenas.length() > 0) {
                cadenas.append("-");
            }
            cadenas.append(input);
        }
        
        JOptionPane.showMessageDialog(null, "Cadenas concatenadas: " + cadenas.toString());
    }
}

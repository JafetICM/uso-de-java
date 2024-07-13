import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Ya puedes conducir.");
        } else {
            System.out.println("Aún no puedes conducir.");
        }
        
        scanner.close();
    }
}

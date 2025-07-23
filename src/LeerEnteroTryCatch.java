import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerEnteroTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        do {
            System.out.print("Introduce un número entero: ");
            try {
                numero = sc.nextInt();
                valido = true; // si no lanza excepción, es válido
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debes escribir un entero.");
                sc.nextLine(); // limpiar el buffer (descartar el token inválido)
            }
        } while (!valido);

        System.out.println("Número leído: " + numero);
        sc.close();
    }
}

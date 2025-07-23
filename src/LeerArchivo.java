import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        File archivo = new File("datos.txt"); // archivo que NO existe

        // try-with-resources cierra el Scanner automáticamente
        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe: " + e.getMessage());
            // e.printStackTrace(); // opcional para depurar
        }
    }
}

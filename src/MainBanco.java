import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(500.0);

        System.out.println("Saldo actual: " + cuenta.getSaldo());
        System.out.print("Cantidad a retirar: ");

        double cantidad = sc.nextDouble();

        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro exitoso. Saldo restante: " + cuenta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}

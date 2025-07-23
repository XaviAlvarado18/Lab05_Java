public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Retira dinero de la cuenta.
     * @param cantidad monto a retirar
     * @throws SaldoInsuficienteException si cantidad > saldo disponible
     */
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente. Intentaste retirar " + cantidad +
                            " pero solo hay " + saldo
            );
        }
        saldo -= cantidad;
    }
}

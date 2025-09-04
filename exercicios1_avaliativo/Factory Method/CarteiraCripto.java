public class CarteiraCripto {
    private double saldo;

    public CarteiraCripto(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean possuiSaldo(double valor) {
        return saldo >= valor;
    }

    public void debitar(double valor) {
        if (valor <= saldo) saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class FactoryCriptomoeda extends PagamentoFactory {
    private double saldo;

    public FactoryCriptomoeda(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public iPagamento CriarPagamento() {
        return new PagamentoCriptomoeda(saldo);
    }

}
public class PagamentoCriptomoeda implements iPagamento {

    public double saldo;

    public PagamentoCriptomoeda(double saldo) {
        this.saldo = saldo;
    }

    private boolean saldoSuficiente(double valor) {
        if (saldo >= valor) {
            return true;
        }

        return false;
    }

    @Override
    public String processarPagamento(double valorTransacao) {
        if (saldoSuficiente(valorTransacao)) {
            saldo -= valorTransacao;
            return "Aprovado";
        }

        return "Saldo insuficiente. Tente novamente";
    }
    
}
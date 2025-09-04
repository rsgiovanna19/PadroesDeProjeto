
public class FactoryCriptomoeda extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        // Carteira com saldo inicial
        return new PagamentoCriptomoeda("ENDERECO12345ABC", new CarteiraCripto(1000.00));
    }
}

public class FactoryPayPal extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        // E-mail presente no "gateway" falso
        return new PagamentoPayPal("user@exemplo.com");
    }
}
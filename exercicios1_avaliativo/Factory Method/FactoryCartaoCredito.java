public class FactoryCartaoCredito extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        // Dados fictícios válidos (passam no Luhn-like)
        return new PagamentoCartaoCredito("4111111111111111", "Cliente Demo", "1227", "123");
    }
}

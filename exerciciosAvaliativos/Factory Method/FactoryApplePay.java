public class FactoryApplePay extends PagamentoFactory {
    @Override
    public iPagamento CriarPagamento() {
        return new PagamentoApplePay("demo@icloud.com", "APAY-1A2B3C4D");
    }
}
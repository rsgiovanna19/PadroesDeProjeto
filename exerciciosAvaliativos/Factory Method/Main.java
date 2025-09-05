public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        // Simular pagamento por cartão de crédito
        service.ProcessarPagamento(new FactoryCartaoCredito("1234567812345678"), 150.00);

        // Simular pagamento por PayPal
        service.ProcessarPagamento(new FactoryPayPal("cliente@paypal.com"), 75.00);

        // Simular pagamento por Criptomoeda
        service.ProcessarPagamento(new FactoryCriptomoeda( 500.00), 300.00);
    }
}
public class MainApplePayDemo {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();
        service.processarPagamento(new FactoryApplePay(), 199.90);
    }
}

public class FactoryPayPal extends PagamentoFactory {
    private String email;

    public FactoryPayPal(String email) {
        this.email = email;
    }

    @Override
    public iPagamento CriarPagamento() {
        return new PagamentoPayPal(email);
    }

}
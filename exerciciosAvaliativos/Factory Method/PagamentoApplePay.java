public class PagamentoApplePay implements iPagamento {
    private String email;
    private String token;

    public PagamentoApplePay(String email, String token) {
        this.email = email;
        this.token = token;
    }

    @Override
    public String processarPagamento(double valorTransacao) {
        if (token != null && !token.isEmpty()) {
            return "Pagamento Apple Pay Aprovado";
        }
        return "Pagamento Apple Pay Recusado";
    }
}
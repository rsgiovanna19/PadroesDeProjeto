public class PagamentoPayPal implements Pagamento {
    private final String emailUsuario;
    private final PayPalGatewayFalso gateway = new PayPalGatewayFalso();

    public PagamentoPayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public String processarPagamento(double valor) {
        if (emailUsuario == null || !emailUsuario.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            return "Erro: e-mail inválido.";
        }
        if (!gateway.estaVinculado(emailUsuario)) {
            return "Erro: e-mail não vinculado a uma conta PayPal.";
        }
        return String.format("Pagamento aprovado via PayPal (R$ %.2f) para %s.", valor, emailUsuario);
    }
}

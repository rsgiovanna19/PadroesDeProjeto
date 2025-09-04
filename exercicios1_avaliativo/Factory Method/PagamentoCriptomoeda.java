public class PagamentoCriptomoeda implements Pagamento {
    private final String enderecoCarteira;
    private final CarteiraCripto carteira;

    public PagamentoCriptomoeda(String enderecoCarteira, CarteiraCripto carteira) {
        this.enderecoCarteira = enderecoCarteira;
        this.carteira = carteira;
    }

    @Override
    public String processarPagamento(double valor) {
        if (enderecoCarteira == null || !enderecoCarteira.matches("^[a-zA-Z0-9]{10,}$")) {
            return "Erro: endereço de carteira inválido.";
        }
        if (!carteira.possuiSaldo(valor)) {
            return String.format("Erro: saldo insuficiente (saldo atual: R$ %.2f).", carteira.getSaldo());
        }
        carteira.debitar(valor);
        return String.format("Pagamento aprovado via Criptomoeda (R$ %.2f). Saldo restante: R$ %.2f.", valor, carteira.getSaldo());
    }
}
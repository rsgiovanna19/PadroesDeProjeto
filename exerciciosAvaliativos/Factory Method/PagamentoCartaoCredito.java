public class PagamentoCartaoCredito implements iPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    private boolean validarCartao() {
        if (numeroCartao.length() == 16) {
            return true;
        }

        return false;
    }

    @Override
    public String processarPagamento(double valorTransacao) {
        if (validarCartao()) {
            return "Aprovado! Obrigado(a)";
        }

        return "Invalido";
    }

}
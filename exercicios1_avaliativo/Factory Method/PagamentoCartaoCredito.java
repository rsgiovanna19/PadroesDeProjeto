public class PagamentoCartaoCredito implements Pagamento {
    private final String numeroCartao;
    private final String nomeTitular;
    private final String validadeMMYY;
    private final String cvv;

    public PagamentoCartaoCredito(String numeroCartao, String nomeTitular, String validadeMMYY, String cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validadeMMYY = validadeMMYY;
        this.cvv = cvv;
    }

    @Override
    public String processarPagamento(double valor) {
        if (!validarNumero()) {
            return "Erro: número de cartão inválido.";
        }
        if (!validarCvv() || !validarValidade()) {
            return "Erro: dados do cartão inválidos.";
        }
        // Simula autorização/aprovação:
        return String.format("Pagamento aprovado no Cartão de Crédito (R$ %.2f) para %s.", valor, nomeTitular);
    }

    private boolean validarNumero() {
        if (numeroCartao == null || !numeroCartao.matches("\\d{16}")) return false;
        return luhnLike(numeroCartao);
    }

    // Check fictício no estilo Luhn
    private boolean luhnLike(String digits) {
        int soma = 0;
        boolean duplica = false;
        for (int i = digits.length() - 1; i >= 0; i--) {
            int n = digits.charAt(i) - '0';
            if (duplica) {
                n *= 2;
                if (n > 9) n -= 9;
            }
            soma += n;
            duplica = !duplica;
        }
        return soma % 10 == 0;
    }

    private boolean validarCvv() {
        return cvv != null && cvv.matches("\\d{3}");
    }

    private boolean validarValidade() {
        return validadeMMYY != null && validadeMMYY.matches("(0[1-9]|1[0-2])\\d{2}");
    }
}

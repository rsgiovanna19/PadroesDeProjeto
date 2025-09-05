public class FactoryCartaoCredito extends PagamentoFactory {
    private String numeroCartao;

    public FactoryCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public iPagamento CriarPagamento() {
        return new PagamentoCartaoCredito(numeroCartao);
    }

}
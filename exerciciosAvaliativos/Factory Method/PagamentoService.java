public class PagamentoService {
    public void ProcessarPagamento(PagamentoFactory factory, double valorTransacao) {
        iPagamento Pagamento = factory.CriarPagamento();
        String resultado = Pagamento.processarPagamento(valorTransacao);
        System.out.println(resultado);
    }
}
public class PagamentoApplePay implements Pagamento {
    private final String appleIdEmail;
    private final String deviceToken;
    private final ApplePayGatewayFalso gateway = new ApplePayGatewayFalso();

    public PagamentoApplePay(String appleIdEmail, String deviceToken) {
        this.appleIdEmail = appleIdEmail;
        this.deviceToken = deviceToken;
    }

    @Override
    public String processarPagamento(double valor) {
        if (!gateway.contaAtiva(appleIdEmail)) {
            return "Erro: Apple ID não está ativo/compatível.";
        }
        if (deviceToken == null || !deviceToken.matches("^APAY-[A-Z0-9]{8}$")) {
            return "Erro: Device Token inválido.";
        }
        return String.format("Pagamento aprovado via Apple Pay (R$ %.2f) para %s.", valor, appleIdEmail);
    }
}
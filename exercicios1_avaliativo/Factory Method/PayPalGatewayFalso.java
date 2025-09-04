import java.util.Set;

class PayPalGatewayFalso {
    // E-mails “vinculados” para simulação
    private static final Set<String> EMAILS_VINCULADOS = Set.of(
        "user@exemplo.com",
        "pagante@empresa.com",
        "giovanna@paypal.com"
    );

    public boolean estaVinculado(String email) {
        return EMAILS_VINCULADOS.contains(email.toLowerCase());
    }
}

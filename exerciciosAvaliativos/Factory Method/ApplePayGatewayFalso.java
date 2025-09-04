class ApplePayGatewayFalso {
    public boolean contaAtiva(String appleIdEmail) {
        // Qualquer e-mail com domínio @icloud.com ou @apple.com será considerado ativo aqui
        return appleIdEmail != null && appleIdEmail.toLowerCase().matches("^[^@\\s]+@(icloud\\.com|apple\\.com)$");
    }
}


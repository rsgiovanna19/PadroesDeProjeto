import java.util.ArrayList;

public class PagamentoPayPal implements iPagamento {

    private String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    public ArrayList<String> getEmail() {

        ArrayList<String> listaEmails = new ArrayList<>();

        listaEmails.add("lara@mail.com");
        listaEmails.add("lara2@gmail.com");
        listaEmails.add("lara3@hotmail.com");

        return listaEmails;
    }

    public boolean validarConta() {
        ArrayList<String> listaEmails = getEmail();

        if (listaEmails.contains(email)) {
            return true;
        }

        return false;
    }

    @Override
    public String processarPagamento(double valorTransacao) {
        if (validarConta()) {
            return "Aprovado! Obrigado(a)";
        }
        return "Email invalido";
    }
}
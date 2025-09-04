public class consumidor_contratos {
    public static void main (String[] args){
        consumidor operador = new consumidor();
        contrato_compra_venda c = new contrato_compra_venda();
        contrato_prestacao_servicos s = new contrato_prestacao_servicos();

        //c.mercadoria = "alcool";
        //operador.processar(c);
        
        //consumir contrato de prestação de servico
        operador.processar(s);

    }
}
public class contrato_compra_venda extends contrato{
    //add propriedade mercadoria
    public String mercadoria;

    //sobescrever e salvar
    @Override 
    public Boolean Salvar(){
        if (this.mercadoria.equals(andObject: "alcool")){
            return false;
        }
        return true;
    }
}
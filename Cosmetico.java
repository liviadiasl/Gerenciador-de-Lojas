public class Cosmetico extends Loja{
    private double taxaComercializacao; //Taxa aplicada em lojas que comercializam produtos de beleza
    
    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantProduto, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProduto);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
        "Taxa de comercialização da loja: " + taxaComercializacao;
    }
}
public class Bijuteria extends Loja{
    private double metaVendas; //Indica as vendas mensais da loja
    
    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantProduto, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProduto);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas(){
        return metaVendas;
    }
    
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
        "Meta de vendas mensais: " + metaVendas;
    }
}
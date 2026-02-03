public class Informatica extends Loja{
    private double seguroEletronicos; //Representa um seguro que lojas que vendem aparelhos eletrônicos devem pagar mensalmente
    
    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantProduto, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProduto);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
        "Valor do pagamento da taxa do seguro: " + seguroEletronicos;
    }
}
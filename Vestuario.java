public class Vestuario extends Loja{
    private boolean produtosImportados; //Indica se a loja vende produtos importados ou não
    
    public Vestuario(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantProduto){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProduto);
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
        "Vende produtos importados?: " + produtosImportados;
    }
}
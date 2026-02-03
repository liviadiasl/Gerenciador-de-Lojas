public class Alimentacao extends Loja{
    private Data dataAlvara; //Indica a data que a loja de alimentação recebeu o alvará de funcionamento
    
    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantProduto){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantProduto);
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara(){
        return dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
        "Data que a loja recebeu o alvará de funcionamento: " + dataAlvara;
    }
}
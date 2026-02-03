public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    //getters
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data data){
        if (data.getAno() > dataValidade.getAno()) {
            return false;
        } else if (data.getAno() == dataValidade.getAno()) {
            if (data.getMes() > dataValidade.getMes()) {
                return false;
            } else if (data.getMes() == dataValidade.getMes()) {
                if (data.getDia() > dataValidade.getDia())
                    return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "---Produto---" + "\n" +
        "Nome do produto: " + nome + "\n" +
        "Preço do produto: R$ " + preco + ",00" +
        "Data de validade: " + dataValidade;
    }
}
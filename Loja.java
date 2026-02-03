 public class Loja{ //Cria classe
    private String nome; 
    private int quantidadeFuncionarios; 
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;//Declara um array do tipo Produto
    
    //Construtores
    public Loja (String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantProdutos){ //Construtor de inicialização
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantProdutos];
    }
    
    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantProdutos){ //Construtor de atribuição -1 à salarioBaseFuncionarios
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantProdutos];
    }
    
    //Getters
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public int getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(int salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    //Método gastosComSalario
    public int gastosComSalario(){
        if (salarioBaseFuncionario <= 0) return -1;
        System.out.print("Gasto com o salário dos funcionários: "); 
        return salarioBaseFuncionario * quantidadeFuncionarios;
    }
    
    //Método tamanhoDaLoja
    public char tamanhoDaLoja(){
        System.out.println("O tamanho da loja é: ");
        if (quantidadeFuncionarios < 10) return 'P';
        else if (quantidadeFuncionarios <= 30) return 'M';
        else return 'G';
    }
    
    public void imprimeProdutos(){
        System.out.print("---Informação de todos os produtos da loja--- \n");
    
        int count = 1;
    
        for (int i = 0; i < estoqueProdutos.length; i++) {
            Produto p = estoqueProdutos[i];
            if (p != null){
                System.out.println("Produto " + count + ":");
                System.out.println(" Nome: " + p.getNome());
                System.out.println(" Preço: R$ " + p.getPreco() + ",00");
                System.out.println();
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Nenhum produto no estoque.");
        }
    }    
    
    public boolean insereProduto(Produto produto){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        System.out.println("Estoque cheio. Não há mais espaço para inserir produtos.");
            return false;
    }
    
    public boolean removeProduto(String nomeProduto){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null;
                System.out.println("Produto removido do estoque.");
                return true;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
        return false;
    }
    
    //Método toString
    @Override
    public String toString(){
        return "---Loja---" + "\n" +
        "Nome: " + nome + "\n" +
        "Quantidade de funcionários: " + quantidadeFuncionarios + "\n" +
        "Salário base dos funcionários: " + salarioBaseFuncionario + "\n" +
        "Endereço da loja: " + endereco + "\n" +
        "Data de fundação da loja: " + dataFundacao;
    }
}
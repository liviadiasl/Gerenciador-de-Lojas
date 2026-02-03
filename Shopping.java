public class Shopping{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping (String nome, Endereco endereco, int quantidadeMaximaDeLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaDeLojas];
    }
    
    //getters
    public String getNome(){
        return nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Loja[] getLojas(){
        return lojas;
    }
    
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    
    //Métodos    
    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        System.out.println("Não foi possível adicionar loja: capacidade máxima atingida.");
        return false;
    }
    
    public boolean removeLoja(String nomeLoja){
        for (int i = 0; i < lojas.length; i++) {
        if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
            lojas[i] = null;
            System.out.println("Loja removida do conjunto de lojas do Shopping.");
            return true;
        }
    }
        System.out.println("Loja não encontrada!");
        return false;
    }
    
    public int quantidadeLojasPorTipo(String tipoLoja) {
        String[] tiposValidos = {"Cosmetico", "Vestuario", "Bijuteria", "Alimentacao", "Informatica", "Cosmético", "Vestuário", "Alimentação", "Informática"};
        
        boolean tipoValido = false;
        
        for (int i = 0; i < tiposValidos.length; i++) {
            if (tipoLoja.equalsIgnoreCase(tiposValidos[i])) {
                tipoValido = true;
                break;
            }
        }
        
        if (!tipoValido) {
            return -1;
        }
        
        int quantidade = 0;
        
        for (int i = 0; i < lojas.length; i++){
            Loja loja = lojas[i];
            if (loja != null){
                if (tipoLoja.equalsIgnoreCase("Cosmetico") && loja instanceof Cosmetico){
                    quantidade++;
                } else if (tipoLoja.equalsIgnoreCase("Vestuario") && loja instanceof Vestuario){
                    quantidade++;
                } else if (tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria){
                    quantidade++;
                } else if (tipoLoja.equalsIgnoreCase("Alimentacao") && loja instanceof Alimentacao){
                    quantidade++;
                } else if (tipoLoja.equalsIgnoreCase("Informática")&& loja instanceof Informatica){
                    quantidade++;
                }
            }
        }
            return quantidade;
    }
    
    public Informatica lojaSeguroMaisCaro(){
        Informatica maisCaro = null;
        double maiorSeguro = -1;

        for (int i = 0; i < lojas.length; i++){
            Loja loja = lojas[i];
            if (loja instanceof Informatica){
                Informatica inf = (Informatica) loja;
                
                if (inf.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = inf.getSeguroEletronicos();
                    maisCaro = inf;
                }
            }
        }
        return maisCaro;
    }
    
    @Override
    public String toString(){
        return "---Shopping---" + "\n" +
        "Nome do estabelecimento: " + nome + "\n" +
        "Endereço do estabelecimento: " + endereco + "\n" +
        "Nome das lojas: " + lojas;
    }
}
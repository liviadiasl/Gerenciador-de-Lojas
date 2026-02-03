public class Principal{
    public static void main(String[] args){
        Loja loja = null;
        Produto produto = null;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("Digite [1] para criar uma loja");
            System.out.println("Digite [2] para criar um produto");
            System.out.println("Digite [3] para sair");
            int opcao = Teclado.leInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    loja = criarLoja();
                    if (loja != null){
                        System.out.println(loja.toString());
                        System.out.println(loja.gastosComSalario());
                        System.out.println(loja.tamanhoDaLoja());
                    }
                    break;
                case 2:
                    produto = criarProduto();
                    if (produto != null){
                        Data data = new Data(20, 10, 2023);
                        if (produto.estaVencido(data)) {
                            System.out.println("PRODUTO VENCIDO");
                        } else {
                            System.out.println("PRODUTO NÃO VENCIDO");
                        }
                    }

                    break;
                case 3:
                    if(loja == null || produto == null)
                        System.out.println("Loja ou produto não criados.");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
    
    public static Loja criarLoja(){
        return new Loja(Teclado.leString("Digite o nome da loja: "),
                             Teclado.leInt("Digite a quantidade de funcionários da loja: "),
                             Teclado.leInt("Digite o salário base dos funcionários: "),
                  new Endereco(Teclado.leString("Digite o nome da rua: "),
                             Teclado.leString("Digite o nome da cidade: "),
                             Teclado.leString("Digite o nome do estado: "),
                             Teclado.leString("Digite o nome do país: "),
                             Teclado.leString("Digite o CEP: "),
                             Teclado.leString("Digite o número: "),
                             Teclado.leString("Digite o complemento: ")),
                  new Data(Teclado.leInt("Digite o dia: "),
                             Teclado.leInt("Digite o mês: "),
                             Teclado.leInt("Digite o ano: ")),
                  Teclado.leInt("Informe a quantidade de produtos que serão adicionados na loja: "));
    }
    
    public static Produto criarProduto(){
        return new Produto(Teclado.leString("Digite o nome do produto: "),
                                Teclado.leDouble("Digite o preço do produto: "),
                    new Data(Teclado.leInt("Digite o dia da validade do produto: "),
                                Teclado.leInt("Digite o mês da validade do produto: "),
                                Teclado.leInt("Digite o ano da validade do produto: ")));
    }
}
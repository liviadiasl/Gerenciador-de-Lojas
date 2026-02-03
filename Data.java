public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;

        if (mes < 1 || mes > 12 || dia < 1) {
            System.out.println("Data inválida! Usando data padrão 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        else if (mes == 2) {
            if ((verificaAnoBissexto() && dia > 29) || (!verificaAnoBissexto() && dia > 28)) {
                System.out.println("Data inválida! Usando data padrão 1/1/2000");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            } else {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        }

        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Data inválida! Usando data padrão 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        else if (dia > 31) {
            System.out.println("Data inválida! Usando data padrão 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    //getters
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    //setters
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean verificaAnoBissexto(){
        return (ano % 4 == 0 && ano % 100 != 0);
    }
    
    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }
}
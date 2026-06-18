package javaapplication1;

public class Animal {
    String Nome;
    float Comprimento;
    float Patas;
    String Cor;
    String Ambiente;
    float Velocidade;
    Animal(String Nome, String Cor,  String Ambiente, float Patas, float Velocidade, float Comprimento){
        this.Nome = Nome;
        this.Cor = Cor;
        this.Ambiente = Ambiente;
        this.Patas = Patas;
        this.Velocidade = Velocidade;
        this.Comprimento = Comprimento;
    }
    void getsetNome(){
        this.Nome = Nome;
    }
    String getNome(){
        return this.Nome = Nome;
    }
     void getsetComprimento(){
        this.Comprimento = Comprimento;
    }
    float getComprimento(){
        return this.Comprimento = Comprimento;
    }
    void setPatas(){
        this.Patas = Patas;
    }
    float getPatas(){
        return this.Patas = Patas;
    }
    void setAmbiente(){
        this.Ambiente = Ambiente;
    }
    String getAmbiente(){
        return this.Ambiente;
    }
    void setCor(){
        this.Cor = Cor;
    }
    String getCor(){
        return this.Cor = Cor;
    }
    void setVelocidade(){
        this.Velocidade = Velocidade;
    }
    float getVelocidade(){
        return this.Velocidade = Velocidade;
    }
    void Dados(){
        System.out.println("Nome: "+ Nome+"\n"
                + "Patas: "+Patas+"\n"
                        + "Cor: "+Cor+"\n"
                                + "Ambiente: "+ Ambiente+"\n"
                                        + "Velocidade: "+Velocidade+"\n"
                                                + "Comprimento: "+Comprimento);
    }
}

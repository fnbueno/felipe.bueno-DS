package javaapplication1;
public class Mamifero extends Animal {
    String Alimento;
    public Mamifero(String Nome, String Cor, String Ambiente, float Patas, float Velocidade, float Comprimento, String Alimento) {
        super(Nome, Cor, Ambiente, Patas, Velocidade, Comprimento);
        this.Alimento = Alimento;
    }
    void setAlimento(){
        this.Alimento = Alimento;
    }
    String getAlimento(){
        return this.Alimento = Alimento;
    }
    void dadosMamifero(){
        System.out.println("Nome: "+ Nome+"\n"
                + "Patas: "+Patas+"\n"
                        + "Cor: "+Cor+"\n"
                                + "Ambiente: "+ Ambiente+"\n"
                                        + "Velocidade: "+Velocidade+"\n"
                                                + "Comprimento: "+Comprimento+"\n"
                                                        + "Alimento: "+Alimento);
    }
    
}

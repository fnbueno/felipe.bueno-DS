package javaapplication1;

public class Peixe extends Animal {
    String Caracteristica;
    public Peixe(String Nome, String Cor, String Ambiente, float Patas, float Comprimento, float Velocidade, String Caracteristica) {
        super(Nome, Cor, Ambiente, Patas, Velocidade, Comprimento);  
        this.Caracteristica = Caracteristica;
    }
    void setCaracteristica(){
           this.Caracteristica = Caracteristica; 
        }
    String getCaracteristica(){
        return this.Caracteristica = Caracteristica;
    }
    void dadosPeixe(){
        System.out.println("Nome: "+ Nome+"\n"
                + "Patas: "+Patas+"\n"
                        + "Cor: "+Cor+"\n"
                                + "Ambiente: "+ Ambiente+"\n"
                                        + "Velocidade: "+Velocidade+"\n"
                                                + "Comprimento: "+Comprimento+"\n"
                                                    + "Caracteristca: "+ Caracteristica);
    }
}

package javaapplication1;
public class TestarAnimais {
    public static void main(String[] args) {
        Peixe Tubarao = new Peixe("Tubarao", "Cinzento", "Mar", 0, 300, 1, "Barbatanas e cauda");
        Mamifero Camelo = new Mamifero("Camelo", "Amarelo","Terra", 4, 150, 2, "Cacto");
        Mamifero Ursocanada = new Mamifero("Urso-do-canada", "Vermelho", "Terra", 4, 180, 1, "Mel");
        Tubarao.dadosPeixe();
        Camelo.dadosMamifero();
        Ursocanada.dadosMamifero();
    }
}

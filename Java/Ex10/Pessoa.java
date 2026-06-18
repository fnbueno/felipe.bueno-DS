package javaapplication2;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String matricula;
    public Pessoa(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    void setNome(){
        this.nome = nome;
    }
    String getNome(){
        return this.nome = nome;
    }
    void setIdade(){
        this.idade = idade;
    }
    int getIdade(){
        return this.idade = idade;
    }
    void setMatricula(){
        this.matricula = matricula;
    }
    String getMatricula(){
        return this.matricula = matricula;
    }
    public void ImprimirDados(String nome, int idade, String matricula){
        System.out.println("Nome: "+this.nome+"\n"
                + "Idade: "+this.idade+"\n"
                        + "Matricula: "+ this.matricula);
    }
    abstract double calcularBonus();
}

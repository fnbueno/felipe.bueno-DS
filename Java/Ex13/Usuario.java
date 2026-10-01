package javaapplication3;
public class Usuario{
    private String nome;
    private double saldo;
    private double saque;
    public void cadastrar(String nome, double saldo, double saque){
        if (saldo < saque){
            throw new SaldoInsuficienteException("Valor de saque maior que saldo!");
        }
        if (saque <= 0){
            throw new illegalargumentexception("Valor de saque menor que 0!");
        }
        this.nome = nome;
        this.saldo = saldo;
        this.saque = saque;
        
        System.out.println("Usuario "+ nome+ " Sacou "+ saque+" com sucesso!");
    }
}

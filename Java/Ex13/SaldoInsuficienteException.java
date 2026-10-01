package javaapplication3;
public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}

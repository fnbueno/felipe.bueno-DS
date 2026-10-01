package javaapplication3;
public class JavaApplication3 {
    public static void main(String[] args) {
    
    Usuario sistema = new Usuario();
    
    try{
        sistema.cadastrar("Felipe", 1000, 0);
        }catch (SaldoInsuficienteException e){
            System.err.println(e.getMessage());
        }catch (illegalargumentexception e){
            System.err.println(e.getMessage());
        }
    }
}

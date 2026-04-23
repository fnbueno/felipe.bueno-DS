package javaapplication1;
public class Casa extends Imovel{
    private int areaTerreno;
    public Casa(int idimovel, String endereco, double valor, int areaTerreno) {
        super(idimovel, endereco, valor);
        this.areaTerreno = areaTerreno;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Area Terreno: "+areaTerreno);
    }
}

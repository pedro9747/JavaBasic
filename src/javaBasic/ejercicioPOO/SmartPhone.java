package javaBasic.ejercicioPOO;

public class SmartPhone extends SmartDevice{
    //1. Atributos
    protected int IMEI;
    protected String telCompany;
    protected double saldo;

    //2. Constructores

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, double peso, double pulgadas, int bateria, boolean camaraDeFoto, int IMEI, String telCompany, double saldo) {
        super(marca, modelo, color, peso, pulgadas, bateria, camaraDeFoto);
        this.IMEI = IMEI;
        this.telCompany = telCompany;
        this.saldo = saldo;
    }

    //3. Métodos
    public void recargarSaldo(double quantity){
        if(quantity > 0){
        this.saldo += quantity;}
    }

}

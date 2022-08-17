package javaBasic.ejercicioPOO;

public class SmartDevice {
    //1. Atributos

    protected String marca;
    protected String modelo;
    protected String color;
    protected double peso;
    protected double pulgadas;
    protected int bateria;
    protected boolean camaraDeFoto;

    //2. Constructores

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String color, double peso, double pulgadas, int bateria, boolean camaraDeFoto) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
        this.pulgadas = pulgadas;
        this.bateria = bateria;
        this.camaraDeFoto = camaraDeFoto;
    }
    //3. Métodos
    public void cargarBateria(int quantity){
        if(this.bateria < 100 && quantity > 0 && this.bateria + quantity <= 100){
            this.bateria += quantity;}
    }

}

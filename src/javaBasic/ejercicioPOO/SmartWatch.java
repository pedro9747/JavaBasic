package javaBasic.ejercicioPOO;

public class SmartWatch extends SmartDevice{
    //1. Atributos
    boolean controlFit;
    boolean recargaInalambrica;
    String hora;


    //2. Constructores

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, double peso, double pulgadas, int bateria, boolean camaraDeFoto, boolean controlFit, boolean recargaInalambrica, String hora) {
        super(marca, modelo, color, peso, pulgadas, bateria, camaraDeFoto);
        this.controlFit = controlFit;
        this.recargaInalambrica = recargaInalambrica;
        this.hora = hora;
    }

    //3. Métodos
    public void setHora(String horaNueva){
        this.hora = horaNueva;
    }
    public void darLaHora(){
        System.out.println("Son las " + this.hora);
    }

}

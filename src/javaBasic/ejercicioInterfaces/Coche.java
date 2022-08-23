package javaBasic.ejercicioInterfaces;

public class Coche {
    //Atributos
    public String marca;
    public String modelo;
    public String color;
    public int velocidad;

    //Constructor

    public Coche(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    //Métodos
    public void acelerar(int vel){
        if((velocidad += vel) >= 0 && (velocidad += vel)<130) {
            velocidad += vel;
        }
    }
}

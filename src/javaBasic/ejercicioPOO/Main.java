package javaBasic.ejercicioPOO;


public class Main {
    public static void main(String[] args) {

        SmartPhone miCelular = new SmartPhone("Samsung", "S10+", "Negro", 170.0, 11.1,
                                        20, true, 123789, "Tuenti", 990);
        miCelular.recargarSaldo(100.50);
        miCelular.cargarBateria(60);

        SmartWatch miWatch = new SmartWatch("Xiaomi", "GTS2", "Gris", 90.3, 2.1,
                                        35, false, true, true, "00:00");

        miWatch.cargarBateria(50);
        miWatch.setHora("23:18");
        miWatch.darLaHora();

        System.out.println("Tu smartphone es un " + miCelular.marca + " modelo " + miCelular.modelo);
        System.out.println("Es de color " + miCelular.color + ", pesa " + miCelular.peso + " gramos, su pantalla es de "
                            + miCelular.pulgadas + " pulgadas y actualmente tiene " + miCelular.bateria + "% de batería." +
                            "¿Posee cámara de fotos? " + miCelular.camaraDeFoto);
        System.out.println("El IMEI es " + miCelular.IMEI + ". La compañía telefónica es " + miCelular.telCompany +
                            " y actualmente tu saldo es de $" + miCelular.saldo);

        System.out.println("Tu smartphone es un " + miWatch.marca + " modelo " + miWatch.modelo);
        System.out.println("Es de color " + miWatch.color + ", pesa " + miWatch.peso + " gramos, su pantalla es de "
                + miWatch.pulgadas + " pulgadas y actualmente tiene " + miWatch.bateria + "% de batería." +
                "¿Posee cámara de fotos? " + miWatch.camaraDeFoto);
        System.out.println("¿Puede hacer un seguimiento de tus hábitos? " + miWatch.controlFit + " ¿Posee recarga inalámbrica? " +
                              miWatch.recargaInalambrica + ". En este momento marca las " + miWatch.hora + " hs.");


    }
}

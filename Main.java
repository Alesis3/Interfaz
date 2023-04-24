import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
     Camion camion = new Camion("disel", 4);
        System.out.println(camion);

        System.out.println(camion.encender());
        camion.avanzar();
        camion.frena();
        System.out.println(camion.apagar());





        Motocicleta moto = new Motocicleta(150, "Italika");
        System.out.println(moto);

        moto.encender();
        moto.avanzar();
        moto.caballito();
        moto.frena();
        moto.apagar();
    }
}
public class Motocicleta implements Vehiculo {

    private int centimetrosCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        this.marca = marca;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void caballito(){
        System.out.println("Haciendo caballito");
    }

    @Override
    public boolean encender() {
        System.out.println("Encenciendo la motocicleta " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando motocicleta " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando motocicleta " + this.centimetrosCubicos + "CC");

    }

    @Override
    public void frena() {
        System.out.println("Frenando motocicleta " + this.centimetrosCubicos + "CC");

    }
}

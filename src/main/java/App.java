public class App {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("rojo","12345","PM0123",4,1000,4);

        if (coche.tieneClaxon() == true){
            System.out.println("bip biiiiip");
        } else System.out.println("...");
    }


}

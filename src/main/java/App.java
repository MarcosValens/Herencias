public class App {
    public static void main(String[] args) {
        Renting rent = new Renting();
        /*Vehiculo coche = new Coche("rojo","12345","PM0123",4,1000,4);*/
        Vehiculo moto = new Moto("verde","09876","0073JVK",2,200);
        Vehiculo buggy = new Buggy("amarillo","56789","9999AAA",4,49,0);

        if (buggy.tieneClaxon()){
            System.out.println("bip biiiiip");
        } else System.out.println("...");
        /*rent.rent(coche);*/
        rent.rent(moto);
        rent.rent(buggy);
        rent.lista();
    }
}

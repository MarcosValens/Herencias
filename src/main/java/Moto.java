public class Moto extends Vehiculo{
    public Moto(String color, String numBastidor, String matricula, int ruedas, int cilindrada) {
        super(color, numBastidor, matricula, ruedas, cilindrada);
    }

    @Override
    public boolean tieneClaxon() {
        return true;
    }
}

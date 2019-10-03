public class Buggy extends Coche {
    public Buggy(String color, String numBastidor, String matricula, int ruedas, int cilindrada, int puertas) {
        super(color, numBastidor, matricula, ruedas, cilindrada, puertas);
    }

    @Override
    public boolean isElectric() {
        return false;
    }

    @Override
    public boolean tieneClaxon() {
        return true;
    }
}

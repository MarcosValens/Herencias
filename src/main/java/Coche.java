public class Coche extends Vehiculo{
    private int puertas;

    public Coche(String color, String numBastidor, String matricula, int ruedas, int cilindrada, int puertas) {
        super(color, numBastidor, matricula, ruedas, cilindrada);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public boolean tieneClaxon(){
        return true;
    };
}

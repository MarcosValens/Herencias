import java.util.Objects;

public class Vehiculo {
    private String color;
    private String numBastidor;
    private String matricula;
    private int ruedas;
    private int cilindrada;

    public Vehiculo(String color, String numBastidor, String matricula, int ruedas, int cilindrada) {
        this.color = color;
        this.numBastidor = numBastidor;
        this.matricula = matricula;
        this.ruedas = ruedas;
        this.cilindrada = cilindrada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean tieneClaxon(){
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return getRuedas() == vehiculo.getRuedas() &&
                getCilindrada() == vehiculo.getCilindrada() &&
                Objects.equals(getColor(), vehiculo.getColor()) &&
                Objects.equals(getNumBastidor(), vehiculo.getNumBastidor()) &&
                Objects.equals(getMatricula(), vehiculo.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getNumBastidor(), getMatricula(), getRuedas(), getCilindrada());
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", numBastidor='" + numBastidor + '\'' +
                ", matricula='" + matricula + '\'' +
                ", ruedas=" + ruedas +
                ", cilindrada=" + cilindrada +
                '}';
    }
}

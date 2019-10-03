import java.util.ArrayList;

public class Renting {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    public void rent(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public void lista(){
       /* for (Vehiculo vehiculo:this.vehiculos) {
            System.out.println(vehiculo+" tipo "+vehiculo.getClass().getName());
        }*/

        for (Vehiculo vehiculo:this.vehiculos) {
            System.out.println("Color "+ vehiculo.getColor());
            System.out.println("Plate "+ vehiculo.getMatricula());
            if(vehiculo instanceof Coche){
                System.out.println("Car");
            } else if (vehiculo instanceof Moto){
                System.out.println("Motor Bike");
            } else if (vehiculo instanceof Buggy) System.out.println("Buggy");
        }
    }
}

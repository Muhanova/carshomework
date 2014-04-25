package home.npp.cars;

/**
 * Created by Даша on 15.04.14.
 */
public abstract class Truck extends Car {
    public Truck(String color, int id) {
        super(color, id);
    }

    public String toString(){
        return super.toString();
    }

    public void ride(){
        System.out.println("Moves");
    }
}

package home.npp.cars;

/**
 * Created by Даша on 15.04.14.
 */
public abstract class Automobile extends Car{
    public Automobile(String color, int id) {
        super(color, id);
    }

    public String toString(){
        return super.toString();
    }

    public void ride(){
        System.out.println("Moves");
    }
}

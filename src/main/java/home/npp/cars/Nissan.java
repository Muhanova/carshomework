package home.npp.cars;

/**
 * Created by Даша on 15.04.14.
 */
public class Nissan extends Automobile{
    public Nissan(String color, int id) {
        super(color, id);
    }

    public String toString(){
        return super.toString();
    }

    public void ride(){
        super.ride();
        System.out.println("Japanese car");
    }
}

package home.npp.cars;

/**
 * Created by Даша on 15.04.14.
 */
public class Ferrari extends Racecar {
    public Ferrari(double speed, String color, int id) {
        super(speed, color, id);
    }

    public String toString(){
        return super.toString();
    }

    public void ride(){
        super.ride();
        System.out.println("Italian car");
    }
}

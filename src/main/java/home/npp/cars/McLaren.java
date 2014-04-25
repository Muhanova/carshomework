package home.npp.cars;

/**
 * Created by Даша on 15.04.14.
 */
public class McLaren extends Racecar {
    public McLaren(double speed, String color, int id) {
        super(speed, color, id);
    }

    public String toString(){
        return super.toString();
    }

    public void ride(){
        super.ride();
        System.out.println("British car");
    }
}

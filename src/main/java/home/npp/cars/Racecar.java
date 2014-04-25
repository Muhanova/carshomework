package home.npp.cars;

/**
 * Created by Даша on 15.04.14.
 */
public abstract class Racecar extends Car{
    private double speed;

    public Racecar(double speed, String color, int id){
        super(color, id);
        this.speed=speed;
    }

    public double get_speed(){
        return this.speed;
    }

    public void set_speed(double speed){
        this.speed=speed;
    }

    public String toString(){
        return super.toString();
    }

    public void ride(){
        System.out.println("Moves with speed: "+speed);
    }
}

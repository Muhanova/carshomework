package home.npp.cars;

/**
 * Created by Даша on 23.04.14.
 */
public class AutomobileFactory {
    public static Nissan createCar(String carType){
        if(carType.equals("Nissan")){
            return new Nissan("white", 1+(int)(Math.random()*5));
        } else return null;
    }
}

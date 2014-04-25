package home.npp.cars;

/**
 * Created by Даша on 23.04.14.
 */
public class TruckFactory {
    public static MAN createCar(String carType){
        if(carType.equals("MAN")){
            return new MAN("black", 1+(int)(Math.random()*5));
        } else return null;
    }
}

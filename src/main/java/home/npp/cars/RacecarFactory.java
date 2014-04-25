package home.npp.cars;

import java.util.Random;

/**
 * Created by Даша on 15.04.14.
 */
public class RacecarFactory{
    public static Car createCar(String carType){
        if(carType.equals("McLaren")){
            return new McLaren(370, "yellow", 1+(int)(Math.random()*5));
        } else if(carType.equals("Ferrari")){
            return new Ferrari(275, "red", 1+(int)(Math.random()*5));
        } else return null;
    }
}

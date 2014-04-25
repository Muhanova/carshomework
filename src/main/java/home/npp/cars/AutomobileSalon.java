package home.npp.cars;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Даша on 23.04.14.
 */
public class AutomobileSalon {
    ArrayList <Racecar> McLarens=new ArrayList<Racecar>();
    ArrayList <Racecar> Ferraries=new ArrayList<Racecar>();
    ArrayList<Truck> MANs=new ArrayList<Truck>();
    ArrayList<Automobile> Nissans=new ArrayList<Automobile>();

    Random r=new Random();
    public AutomobileSalon(){
        for (int i=0; i<r.nextInt(5); i++){
            MANs.add(i, TruckFactory.createCar("MAN"));
        }
        for (int i=0; i<r.nextInt(10); i++){
            McLarens.add(i, (Racecar) RacecarFactory.createCar("McLaren"));
        }
        for (int i=0; i<r.nextInt(15); i++){
            Ferraries.add(i, (Racecar) RacecarFactory.createCar("Ferrari"));
        }
        for (int i=0; i<r.nextInt(20); i++){
            Nissans.add(i, AutomobileFactory.createCar("Nissan"));
        }
    }

    public ArrayList<Car> findCarsById(int id){
        ArrayList<Car> carArrayList=new ArrayList<Car>();
        for (int i=0; i<McLarens.size(); i++){
            if(McLarens.get(i).get_id()==id){
                carArrayList.add(McLarens.get(i));
            }
        }
        for (int i=0; i<Ferraries.size(); i++){
            if(Ferraries.get(i).get_id()==id){
                carArrayList.add(Ferraries.get(i));
            }
        }
        for (int i=0; i<MANs.size(); i++){
            if(MANs.get(i).get_id()==id){
                carArrayList.add(MANs.get(i));
            }
        }
        for (int i=0; i<Nissans.size(); i++){
            if(Nissans.get(i).get_id()==id){
                carArrayList.add(Nissans.get(i));
            }
        }

        return carArrayList;
    }

    public void printCars(ArrayList<Car> carArrayList){
        for (int i=0; i<carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i).toString());
        }
    }
}

package home.npp.cars;

import sun.print.resources.serviceui;

/**
 * Created by Даша on 15.04.14.
 */
public abstract class Car implements Rideable{
    private String color;
    private int id;

    public Car(String color, int id){
        this.color=color;
        this.id=id;
    }

    public void set_color(String color){
        this.color=color;
    }

    public String get_color(){
        return this.color;
    }

    public void set_id(int id){
        this.id=id;
    }

    public int get_id(){
        return this.id;
    }

    public String toString(){
        return ("I'm car. My color is "+color+". My id is "+id+".");
    }
}

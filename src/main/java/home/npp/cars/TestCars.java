package home.npp.cars;

import java.util.Scanner;

/**
 * Created by Даша on 25.04.14.
 */
public class TestCars {
    public static void main(String[] args) {
        AutomobileSalon salon = new AutomobileSalon();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        salon.printCars(salon.findCarsById(id));
    }
}

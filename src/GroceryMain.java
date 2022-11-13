//-----------------------------------------------------
// Title: GroceryMain class
// Author: İhsan Melih Şişman
// Assignment: Patika Week [1_2]
// Description: This class is the BodyMassIndexCalculator class that used for locating specific features for main class.
// Note: İhsan Melih Şişman is available to work part-time or long-term internship 3 days a week during the 2022 - 2023 university term
//-----------------------------------------------------
/**
 * by:
 * @author İhsan Melih Şişman
 */

import java.util.Scanner;

public class GroceryMain {
    public static void main(String[] args) {

        // It should be defined because it is needed to take input from the user with this object.
        Scanner scanner = new Scanner(System.in);

        /**
         *
         * All of these nextdoubles() takes input from the user
         */
        System.out.print("Armut Kaç Kilo ? :");
        double pear = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        double apple = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        double tomato = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        double banana = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        double eggPlant = scanner.nextDouble();

        // Defines all of the attributes the equal one of GroceryProperties.
        GroceryProperties groceryProperties = new GroceryProperties(pear, apple, tomato,
                banana, eggPlant);

        // By using calculate method in the GroceryProperties, It sums all of inputs.
        System.out.println("Toplam Tutar : " + groceryProperties.calculate(pear, apple, tomato, banana, eggPlant) + " TL");

    }
}

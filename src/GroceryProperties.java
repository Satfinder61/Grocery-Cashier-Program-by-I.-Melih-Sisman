// Title: GroceryMain class
// Author: İhsan Melih Şişman
// Assignment: Patika Week [1_2]
// Description: This class is the GroceryProperties class that used for locating specific features for GroceryMain class.
// Note: İhsan Melih Şişman is available to work part-time or long-term internship 3 days a week during the 2022 - 2023 university term
//-----------------------------------------------------
/**
 * by:
 * @author İhsan Melih Şişman
 */


public class GroceryProperties {


    // Initializing  attributes for the project.
    double pearPrice;
    double applePrice;
    double tomatoPrice;
    double bananaPrice;
    double eggPlantPrice;
    double total = 0;


    /**
     *
     * Defines specific properties for the given attributes.
     */
    public GroceryProperties(double pear, double apple, double tomato, double banana, double eggPlant) {
        this.pearPrice = 2.14;
        this.applePrice = 3.67;
        this.tomatoPrice = 1.11;
        this.bananaPrice = 0.95;
        this.eggPlantPrice = 5.00;
    }

    /**
     *
     * This method is the sum of the all objects.
     */
    public double calculate(double pear, double apple, double tomato, double banana, double eggPlant) {
        return total = pearPrice * pear + applePrice * apple + tomatoPrice * tomato + bananaPrice * banana + eggPlantPrice * eggPlant;
    }

}

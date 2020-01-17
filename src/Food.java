
import java.net.URL;
import javax.swing.ImageIcon;

public abstract class Food {

    public int calories, grams; //every food item has calories and gramss
    protected String name; //every food item has a name
    protected ImageIcon i; //every food has an image to go with it
    protected double price; //every food item has a price associated with it
    protected static boolean is12Inch = false; //every food item is defaulted for 6 inch, but can also be changed to 12 inch(static because universal for entire sandwich)

    protected static int numFoodItems = 0; //total number of food items used in sandwich
    protected static double totalPrice = 0; //total price of all the food items used in sandwich
    protected static int totalCalories = 0; //total calories in sandwich
    protected static int totalGrams = 0; //total grams of sandwich

    public Food(int c, int g, String n, String img) {
        calories = c; //supply a calorie, grams, and name to create a food product
        grams = g;
        name = n;
        URL file = getClass().getResource(img); //to create image of food item
        i = new ImageIcon(file);
        numFoodItems++; //evertime you make a new food item—must add 1 item to total items used
        totalCalories += c; //add calories of item to total for sandwich
        totalGrams += g; //add grams of item to total for sandwich
    }

    public Food(Food other) {
        //use this constructor when you want to get extra of something (clone it)
        calories = other.calories;
        grams = other.grams;
        name = other.name;
        i = other.i;
        numFoodItems++; //evertime you make a new food item—must add 1 item to total items used
        totalCalories += other.calories; //add calories of item to total for sandwich
        totalGrams += other.grams; //add grams of item to total for sandwich
    }

    //calculate the calories and grams. 
    //if they are 6 inch just return the default calories and grams which are already for 6 inch 
    //but if is12inch double values and add more to totalCalories and totalGrams
    public void calcCalories() {
        if (is12Inch) {
            totalCalories += calories;
            calories *= 2;
        }
    }

    public void calcGrams() {
        if (is12Inch) {
            totalGrams += grams;
            grams *= 2;
        }
    }

    //use this method to change sandiwch from default 6 inch to 12 inch
    public static void TwelveInchSub() {
        is12Inch = true;
    }

    //how price is calculated is different for each child
    public abstract void calcPrice();

    //Getters for returning properties
    public final String getName() {
        return name; //return name of food item
    }

    public final int getCalories() {
        return calories; //returns calories of food item
    }

    public final int getGrams() {
        return grams; //returns grams of food item
    }

    public final double getPrice() {
        return price; //returns price of food item
    }

    //how images are selected is different in each class
    public abstract ImageIcon getImage();


    //Static methods for returning the static variables
    public static int getNumFoodItems() {
        return numFoodItems; //return the number of food items used
    }

    public static double getTotalCalories() {
        return totalCalories; //returns total price of all items used in product
    }

    public static double getTotalGrams() {
        return totalGrams; //returns total price of all items used in product
    }

    public static double getTotalPrice() {
        return totalPrice; //returns total price of all items used in product
    }

    public String toString() {
        String str = String.format("%s:\n", name);
        str += String.format("Calories: %d, Grams: %d\n", calories, grams);
        str += String.format("Price: %.2f\n", price);
        return str;
    }
}

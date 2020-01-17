
import java.net.URL;
import javax.swing.ImageIcon;

public class Ingredient extends Food {

    public boolean extracost; //for extra ingredients
    public String type; //type of ignredient—regular (free ingredients (ie. your choice of meat, lettuce) or special (bacon, cheese), 
    ImageIcon TwelveInchServing; //image is different for 12 inch sub

    public Ingredient(int c, int g, String n, String img, String img2, String t) {
        super(c, g, n, img);

        URL file = getClass().getResource(img2); //to set image for normal 12 inch
        TwelveInchServing = new ImageIcon(file); //this pic would instead be used for 12 inch subs—default img is 6 inch

        type = t;
    }

    public Ingredient(Ingredient other) {
        super(other);
        TwelveInchServing = other.TwelveInchServing;
        type = other.type;
    }

    //void method to set if ingredient is extra (2nd one)
    public void setExtraCost() {
        extracost = true;
    }

    @Override
    public void calcPrice() {
        if (type == "Regular") {
            if (extracost) {
                 price = 0.50; //if regular and extra ingredient, it is 50 cents
            } else {
                price = 0; //if first copy of an ingredient, it is $0
            }
        } else { //if type is "Special"
            if (extracost) {
                 price = 1.00; //second of an extra special ingredient is $1
            } else {
                 price = 1.50; //first copt of a special ingredient is 1.50
            }
        }
    }

    @Override
    public final ImageIcon getImage() {
        if (is12Inch) {
            return TwelveInchServing; //return picture of 12 inch seving of ingredients
        } else {
            return i; //return 6 inch sercing of ingredients
        }
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("Ingredient Type: %s\n", type);
        return str;
    }
}

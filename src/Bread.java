
import java.net.URL;
import javax.swing.ImageIcon;

public class Bread extends Food {

    public boolean toasted;
    ImageIcon twelveinch, toast6, toast12;

    public Bread(int c, int g, String n, String img) {
        super(c, g, n, img);

        URL file1 = getClass().getResource("data/12Bun.png"); //to set image for normal 12 inch
        twelveinch = new ImageIcon(file1);

        URL file2 = getClass().getResource("data/ToastedBun.png"); //to set image for toasted 6 inch
        toast6 = new ImageIcon(file2);

        URL file3 = getClass().getResource("data/Toasted12Bun.png"); //to set image for toasted 12 inch
        toast12 = new ImageIcon(file3);
    }

    public Bread(Bread other) {
        super(other);
    }

    @Override
    public void calcPrice() {
        if (is12Inch) {
             price = 10; //if 12 inch sub, price = $10
        } else {
             price = 6; //if 6 inch sub, price = $6
        }
    }
    
    //toast the buns
    public void toast(){
        toasted = true;
    }
    
    @Override
    public final ImageIcon getImage() {
        if (is12Inch) {
            if (toasted) {
                return toast12; //return image of TOASTED 12 inch sub
            } else {
                return twelveinch; //return image of NOT toasted 12 inch sub
            }
        } else if (toasted) {
            return toast6; //return toasted 6 inch image
        } else {
            return i; //return image of just a normal 6 inch (the default picture when creating)
        }
    }

    @Override
    public String toString() { //extending toString method
        String str = super.toString();
        if (is12Inch) {
            str += ("12 Inch Sub\n");
        } else {
            str += ("6 Inch Sub\n");
        }
        if (toasted) {
            str += String.format("Toasted\n");
        } else {
            str += String.format("Untoasted\n");
        }
        return str;
    }

}

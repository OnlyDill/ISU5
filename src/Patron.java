
import java.util.ArrayList;


public class Patron {
    
    ArrayList <Food> SubItems;
    String Name;
    
    public Patron (ArrayList<Food> a, String n){
       SubItems = a;
       Name = n;
    }
    
    public ArrayList<Food> getSubItems(){
     return SubItems;   
    }
    
    public String getName (){
        return Name;
    }
}

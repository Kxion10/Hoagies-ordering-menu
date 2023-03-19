package hoagiestogo;
import java.util.ArrayList;

public class Hoagies {
    //Attributes - variables that describe a hoagie
    String Roll;
    String Meat;
    ArrayList<String> toppings;
    boolean isVegan;

    //Constructor
    public Hoagies() {
    }//end constructor

    //Accessor methods - getters and setters
    public String getRoll() {
        return Roll;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public String getMeat() {
        return Meat;
    }

    public void setMeat(String Meat) {
        this.Meat = Meat;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}//end class

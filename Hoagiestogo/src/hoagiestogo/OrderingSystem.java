package hoagiestogo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderingSystem {
	
	 private static void displayIngredients(ArrayList<String> ingredients){
	        //Use a loop to iterate over the items in the ArrayList and display them
	        //to the customer
	        for(String ingredient : ingredients){
	            System.out.println(ingredient + "\n");
	        }//end for each loop
	 }
	public static void main(String[] args) {
		
		 //Variable for the HTG greeting
	     String greeting = "Welcome to Hoagies to Go!";

	     //Variable to hold the slogan
	     String slogan = "Build Your Own Hoagies, Your Way. Time to build a hoagie.";
	        
	     //Boolean to know if hoagie is vegan
	       Boolean isVegan;
	       
	      //the arraylist for holding the rolls, meats, and toppings 
	       ArrayList<String> Rolls = new ArrayList<String>();
	       ArrayList<String> Meats = new ArrayList<String>();
	       ArrayList<String> toppings = new ArrayList<String>();
	       
	       // Adding the values to the arraylist
	       Rolls.add("whiteroll");
	       Rolls.add("wheatroll");
	       Rolls.add("sesameseedroll");
	       Meats.add("ham");
	       Meats.add("roastbeef");
	       Meats.add("chicken");
	       Meats.add("veggiepatty");
	       toppings.add("cheese");
	       toppings.add("lettuce");
	       toppings.add("tomatoes");
	       toppings.add("onions");
	       toppings.add("bacon");
	       toppings.add("mayonnaise");
	       
	       // greet and give slogan to user
	       System.out.println(greeting);
	       System.out.println(slogan);

	     //Call the method to display the greens types to the customer
	     System.out.println("The types of rolls we have are: \n");
	     displayIngredients(Rolls);
	       
	     //Ask the user to choose a type of Roll they want
	      System.out.println("What type of hoagie roll do you want?");

	        //Get the type of roll from the user as input using the Scanner class
	        Scanner scanner = new Scanner(System.in);
	        String userroll = scanner.next();
	        
	      //Create a new hoagie object and give it the user's roll
	        Hoagies userhoagie = new Hoagies();
	        userhoagie.setRoll(userroll);
	        
	        //Call the method to display the greens types to the customer
		     System.out.println("The types of meat we have are: \n");
		     displayIngredients(Meats);
		       
		    //Ask the user to choose a type of Roll they want
		    System.out.println("What type of meat do you want?");

		    //Get the type of roll from the user as input using the Scanner 
		    String usermeat = scanner.next();
		    //set the users meat in hoagie
		    userhoagie.setMeat(usermeat);
		        
		  //Determine if the meat the customer chose is vegan
	        if(usermeat.equals("ham") || usermeat.equals("roastbeef") || usermeat.equals("chicken")) {
	            isVegan = false;
	        }else{
	            isVegan = true;
	        }//end if	        
	        
	      //Create an array list to hold the toppings
	        ArrayList<String> userToppings = new ArrayList<String>();
	        
	        //Use a while loop to keep prompting the user to choose toppings until the dont want toppings
	        boolean wantsMoreToppings = true;
	        while(wantsMoreToppings){
	            //Prompt the user to choose a topping & display the topping types to the user
	            System.out.println("What type of topping do you want?");
	            displayIngredients(toppings);

	            //Get the topping from the user and add it to the user's list of toppings
	            String userTopping = scanner.next();
	            

	            //Determine if the topping the user chose is vegan
	            if(userTopping.equals("cheese") || userTopping.equals("bacon") || userTopping.equals("mayonnaise")) {
	                isVegan = false;
	            }//end if
	            
	            //add toppings to arraylist
	            userToppings.add(userTopping);

	            //Ask the user if they want another topping
	            System.out.println("Do you want to add another topping to your hoagie? Please reply yes or no");

	            //If the user enters Y, stop looping, else keep going
	            String userResponse = scanner.next();

	            if(userResponse.equals("yes")){
	                wantsMoreToppings = true;
	            } else {
	                wantsMoreToppings = false;
	            }
	        } //end while loop	        
	        
	        //Display a message to the user showing the hoagie they ordered
	        System.out.println("You ordered a " + userhoagie.getMeat() + " hoagie on a " + userhoagie.getRoll() + ".");

	        //Use a loop to display the toppings the user ordered on their hoagie
	        if(userToppings.size() > 0) {   //If the user chose a topping
	            //Print a message about the topping list
	            System.out.println("Your hoagie is topped with: ");
	            for (String topping : userToppings) {
	                System.out.println(topping);
	            }//end for each loop
	        }//end if
	        
	        //If the salad the is vegan, display a vegan message, if not, thank the customer for their order
	        if(isVegan){
	            System.out.println("Thank you for trying our vegan hoagie.");
	        } else {
	            System.out.println("Thank you for ordering a hoagie from Hoagies to Go.");
	        }//end if
	        
	        
	        
	        
	        
	}

}

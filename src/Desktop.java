//Name: Matheeshan Sivalingam 
//Date: 19/09/2021
//Project: Assignment2.java
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File; 

public class Desktop implements Product{
    //Declare private name and price variable
    private String name; 
    private Double price;
    public Desktop(String name,Double price) {
        //Set the instance name variable to name and price received from parameters
        this.name = name;
        this.price = price;
    }
    //Method to return name 
    public String name () {
        //Return name 
        return this.name;
    }

 
    public void getPrice() {
        try{
            //Use Scanner to read computerprices.txt to find price of desktop
            File productList = new File ("src\\computerprices.txt");
            //Declare file
            Scanner myReader = new Scanner (productList);
            //Use while loop to go through each line in txt file
            while (myReader.hasNextLine()) {
                //Obtain string from line
                String data = myReader.nextLine();
                //Split the string into 2 by space
                String[] product = data.split(" ", 2);
                //If the first part of string states laptop, take value price set for laptop
                if (product[0].equals("Desktop")) {
                    //Declare and set variable to price (which is the second part of the split string)
                    double cost = Double.parseDouble(product[1]);
                    //Set the price for this specific instance to cost
                    price = cost;
                    break;
                }
            }
        //Catch statement in the event that the File is not found
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Output to user the price of the product
        System.out.println(name + " costs $"+ price);

}
}


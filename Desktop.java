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
            File productList = new File ("src\\computerprices.txt");
            Scanner myReader = new Scanner (productList);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String [] product = data.split(" ",2);
                if (product[0].equals("Desktop"))
                {
                    double cost = Double.parseDouble(product[1]);
                    price = cost;
                    break;
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Output to user the price of the product
        System.out.println(name + " costs $"+ price);

}
}


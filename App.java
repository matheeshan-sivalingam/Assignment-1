//Name: Matheeshan Sivalingam 
//Date: 19/09/2021
//Project: Assignment2.java

public class App {
    public static void main(String[] args) throws Exception {
        /////////////Factory function//////////////////////////////////////////////
        //Declare product factory 
        AbstractFactory productFactory = new ProductFactory();
        //Create desktop product
        Product desktop = productFactory.getProduct("Desktop", "Alienware Aurora R12 Gaming PC - Lunar Light",0.0);
        //Create laptop product
        Product laptop = productFactory.getProduct("Laptop", "ASUS X515MA Laptop",0.0);
        //Output name of product to user to check if object has been created succesfully
        System.out.println(desktop.name());
        System.out.println(laptop.name());



        //////////////////Pricing functionality/////////////////////
        //Call the getPrice method (this method goes to the computerprices.txt file and obtains price for specific product type)
        //Unclear if the prices set were suppose to be for the product type (Desktop and laptop) or for each specific product (Alienware gaming PC and Asus Laptop).
        //Assumptions were made that the prices are for the product type
        laptop.getPrice();
        desktop.getPrice();

    
    }
}

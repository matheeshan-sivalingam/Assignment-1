//Name: Matheeshan Sivalingam 
//Date: 19/09/2021
//Project: Assignment2.java
public class ProductFactory extends AbstractFactory {

    public Product getProduct(String productType, String name, Double price){
        //If the product type recieved was desktop, create Desktop product
        if (productType.equalsIgnoreCase("Desktop"))
        {
            return new Desktop(name,price);
        }
         //If the product type recieved was laptop, create Laptop product
        else if (productType.equalsIgnoreCase("Laptop"))
        {
            return new Laptop(name,price);
        }
        //Return null if the parameter is not laptop or desktop 
        return null;      
    }


    

}
//Name: Matheeshan Sivalingam
//Date: 19/09/2021
//Project: Assignment2.java

public abstract class AbstractFactory {
    //Create abstract class to get factories for desktop and laptop objects
    abstract Product getProduct(String productType, String name, Double price);
}

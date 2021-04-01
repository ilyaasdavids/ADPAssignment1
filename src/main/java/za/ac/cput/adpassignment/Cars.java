/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1_adp;

/**
 *
 * @author Ilyaas Davids
 * @ studNum 219466424
 */
public class Cars {
    private String brand , color;
    private int price;
    
    public String getBrand() {
        return brand;
    }
    
    public String setBrand(String brand){
        this.brand=brand;
    }
    
     public String getColor() {
        return color;
    }
    
    public String setColor(String color){
        this.color=color;
    }
    
     public int getPrice() {
        return price;
    }
    
    public int setBrand(int price){
        this.price=price;
    }
@Override
    public String toString (){
    return "Car1" + "brand : "+brand+" Color : "+color+" Price : "+ String.valueOf(int(price));
    }
}

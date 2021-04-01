/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment;
/**
 *
 * @author CPUT
 */
public class Book {
    private String title;
    private double price;
    private int copiesInStock;
    
    // Book Constructor    
    Book(){}
    Book (String title, double price, int copiesInStock) {
        this.title = title;
        this.price = price;
        this.copiesInStock = copiesInStock;
    }
    
    // Setters and Getters
    void setTitle(String title){
        this.title = title;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setCopiesInStock(int copiesInStock){
        this.copiesInStock = copiesInStock;
    }
    String getTitle(){
        return this.title;
    }
    double getPrice(){
        return this.price;
    }
    int getCopiesInStock(){
        return this.copiesInStock;
    }
    
//  Display Method   
    public String displayBook(){
       return "Title: " +getTitle()+ "\nPrice: " +getPrice()+ "\nCopies: " +getCopiesInStock();
    }
    
    // discount method check discount over books of R150 getting 10% disc.    
    void checkDiscount(double price){
        if(price > 150){
            price += - price * 0.1;
            System.out.println("You got a discount of 10%.\nYou gonna pay: "+ "R"+price +"\n");
        }
        else System.out.println("There is no discount for Book less than R150");
    }
    
    // Run Program Function
    public static void main(String[] args) {
        Book book1 = new Book("Defining The World", 150.25, 5);
        System.out.println(book1.displayBook());
        book1.checkDiscount(book1.price);
        
        Book book2 = new Book("In The Mind Of A Genuis", 145, 3);
        System.out.println(book2.displayBook());
        book2.checkDiscount(book2.price);  
    }
}

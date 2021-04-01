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
public class Triangle {
    
    /*  Triangle Types
    Equilateral triangle (3,3,3)
    Isosceles triangle (5,4,4)/(4,5,5)
    Scalene triangle (3,4,5)/(5,4,3)
    */
    public String geType(int a, int b, int c){
		if(a==b && a==c)
		return"Equilateral";
		
		else if (a!=b && b!=c && a!=c)return "Scalene";
		else return "Isosceles";
    }
}

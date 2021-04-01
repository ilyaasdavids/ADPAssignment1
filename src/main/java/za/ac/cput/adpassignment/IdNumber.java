/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment;

/**
 *
 * @author Delron Chad Claassen
 * @studentNumber 219360561
 */
public class IdNumber {
	
	public boolean isIdNumber(String string) {
		// TODO Auto-generated method stub
		String digits = string;
		
		if(((digits.length() > 0) && (digits.length() < 14)) && digits.contains("[a-zA-Z]+") == false) {
			return true;
		}else
			return false;
	}
	
}

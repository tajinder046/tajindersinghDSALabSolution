/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.Employee;
/**
 *
 * @author asus
 */
public class CredentialService {
    public char[] generatePassword(){
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyf";
        String numbers = "0123456789";
        String specialCharacter = "!@#$%^&*_=+-/.?<>)";
        String values = capitalLetters + smallLetters + numbers + specialCharacter;
        Random random = new Random();
        char[] password = new char[8];
        for(int i=0;i<8;i++){
            password[i] = values.charAt(random.nextInt(values.length()));
            
        }
        return password;
    }
    public String generateEmailAddress(String firstName , String lastName , String department){
        
        String generateEmail = firstName + lastName + "@" + department + "xyz.com";
        return generateEmail;
    }  
    public void showCredentials(Employee employee, String email, char[] generatedPassword){
        
        System.out.println("Hi " + employee.getFirstName() +" your generated credentials are as follows");
        System.out.println("Email is " +email);
        System.out.println("password is " + generatedPassword);
        
    }
    
}
    


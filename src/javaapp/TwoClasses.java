/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author Admin
 */
public class TwoClasses {
     public static void main(String[] args){
    
        System.out.println("1-st Class");
        ClassTwo classTwo = new ClassTwo();
        Output output = new Output();
        output.setString("Hello ");
         System.out.println(output.getString());
    }
}



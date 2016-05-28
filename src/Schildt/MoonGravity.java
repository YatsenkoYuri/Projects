/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Schildt;

import java.util.Scanner;

/**
 *  
 * @author Admin
 */
public class MoonGravity {
    public static void main(String[] args) {
        System.out.println("Input your weight, kg");
        Scanner in = new Scanner(System.in);
       double earthWeight = in.nextInt();
       double moonWeight = (earthWeight/100)*17;
        System.out.println("Your weight on Earth is "+earthWeight+" kg");
        System.out.println("Your weight on Moon is "+moonWeight+" kg");
        }
    
}

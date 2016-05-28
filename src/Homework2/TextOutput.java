/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TextOutput {
    public static void main(String[] args) {
        System.out.println("Input your name");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Hello, "+s+"!");
    }
    
}

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
public class MultiplicationTable {
        public static void main(String[] args){
        int a=0;
        while(a<10){
            System.out.println("");
            a++;
            int b;
            b = 1;
            while(b<=10) {
                System.out.print(a*b+"\t");
                b++;
            }
        }
    }
}
            

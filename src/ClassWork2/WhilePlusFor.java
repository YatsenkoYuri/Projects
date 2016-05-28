/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork2;

/**
 *
 * @author Admin
 */
public class WhilePlusFor {
    public static void main(String[] args) {
        int i = 10;
        while(i>0){
            for(int j=10; j>=i;){
                System.out.print("*");
                --j;
            }
            i--;
            System.out.println("");
        }
                
        }
    }
    


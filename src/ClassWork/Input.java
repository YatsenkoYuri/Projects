/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0; i<nums.length; i++){
            nums[i]=in.nextInt();
            
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"f ");
        }
        System.out.println("");            
               
    }
    
}

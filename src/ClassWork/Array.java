/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassWork;

/**
 *
 * @author Admin
 */
public class Array {
    public static void main(String[] args) {
        String str = "left*right";
        char[]arr=str.toCharArray();
        int i =0;
        while(arr[i]!='*'){
            arr[i++] = '.';
        }
        str=String.copyValueOf(arr);
        System.out.println(str);
    }
    
}

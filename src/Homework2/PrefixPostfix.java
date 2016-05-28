/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework2;

/**
 *
 * @author Admin
 */
public class PrefixPostfix {
    public static void main(String[] args) {
        int x=10;
        int a=10;
        for(int i=0; i<2; i++){
        int y=++x;
        System.out.println("x="+x+"; y="+y+" this is prefix");
        int b=a++;
        System.out.println("a="+a+"; b="+b+" this is postfix");
        }
    }
    
}

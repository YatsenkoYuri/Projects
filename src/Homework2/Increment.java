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
public class Increment {
    public static void main(String[] args) {
int j,j2;    
    int a = 1;
    int x = 2;
        System.out.println(a);
    a++;
        System.out.println("a++="+a);
    ++a;
        System.out.println("++a="+a);
        int b = ++a;
        int c = a++;
        System.out.println("b="+b + "  c="+c);
        b = a++; c = ++a;
        System.out.println("b="+b + "  c="+c);
        System.out.println("x="+x);
        int y = x++;
        System.out.println("x="+x);
        int z = ++x;
        System.out.println("x="+x +" y="+y + " z="+z);
        for(int i=1; i<=5; i++){
            System.out.println("i="+i);
         j = ++i;
            System.out.println("++i="+i);
         j2 = i++;
            System.out.println("i++="+i);
            System.out.println("j="+j);
            System.out.println("j2="+j2);
        }
        } 
    }


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
public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 8;
        int d = 9;
       // a++;
        b--;
        ++c;
        --d;
        int e = ++a;
        int f = a++;
        int a1=++a + a++;
        System.out.println(a1+" "+a+" "+b+" "+c+" "+d+" "+e+" "+f);
        
    }
    
}

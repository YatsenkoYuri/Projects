/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

/**
 *
 * @author Admin
 */

public class Fibonachi {
    public static void main(String[] args) {
    }
       static int fib (int n ) {
  if (n==1 || n == 2) {
    return 1;
  }
  return fib (n-2) + fib (n-1);
}
}
    


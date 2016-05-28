/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constants_;

/**
 *
 * @author Admin
 */
public class ArrUtil {
    
public void printArr(){
          
   int [][] multiTab = new int[10][10];
    for (int i =0; i < 10; i++){
        for (int j = 0; j < 10; j++) {
            multiTab[i][j] = (i+1)*(j+1);
           // System.out.print(multiTab[i][j] +"\t");
            System.out.printf("%4d",multiTab[i][j]);
            }
            System.out.println();
        }
}
}
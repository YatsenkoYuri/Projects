/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework;

/**
 *
 * @author Admin
 */
public class TabSecondary {
    public void printTab(){
        int[][] multiTab = new int [20][20];
        for(int i = 0; i<20; i++){
            for (int j = 0; j < 20; j++) {
                multiTab[i][j] = (i+1)*(j+1);
                System.out.printf("%5d",multiTab[i][j]);
                }
            System.out.println("");
        }
    }
    
    
}

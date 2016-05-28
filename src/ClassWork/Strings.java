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
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<10; i++){
            sb.append(" " + i);
        }
        String str = sb.toString();
        //StringBuilder str = sb; в этом случае каждая итерация
        //приводит к созданию нового объекта, что засоряет память.
        System.out.println(str);
    }
    
}

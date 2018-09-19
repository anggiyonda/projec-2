 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author ASUS
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int jumlah = 5;
    
    for (int i = 0; i <jumlah; i++){
    for (int j=0; j<jumlah; j++){
        if (i==0 || i==4 || j==0 || j==4){
        System.out.print("#");
    }
        else{
         System.out.print("*");
                }
     }  
     System.out.println();

    }
    }
}

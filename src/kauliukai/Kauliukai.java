/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kauliukai;

/**
 *
 * @author tavar
 */
public class Kauliukai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ridenti kauliukas = new Ridenti();
        Ridenti4 kauliukas4 = new Ridenti4();
        
        for (int i = 0; i < 5; i++) {
            System.out.println(kauliukas.ridenk());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(kauliukas4.ridenk4());
        }
        
        
        
    }
    
}

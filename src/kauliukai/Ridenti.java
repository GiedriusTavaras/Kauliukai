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
public class Ridenti {

    public int skaicius;

    public Ridenti() {
    }

    public String ridenk() {

        for (int i = 0; i < 10; i++) {
            int a = (int) Math.round(Math.random() * 21);
            int b = (int) Math.round(Math.random() * 21);
//            System.out.println(a);
//            System.out.println(b);
            if (a - b <= 3 & a - b >= 0) {
                return "2 ubeliai - win";
            } else {
                return "2 kubeliai - Lost";
            }
        }

    }
}
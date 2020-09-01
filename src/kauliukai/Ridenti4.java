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
public class Ridenti4 extends Ridenti {

    public int skaicius;

    public Ridenti4() {
    }

    public String ridenk4() {
        int a = (int) Math.round(Math.random() * 21);
        int b = (int) Math.round(Math.random() * 21);
        int c = (int) Math.round(Math.random() * 21);
        int d = (int) Math.round(Math.random() * 21);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
        if (a - b <= 4 & a - c <= 4 & a - d <= 4 & a - b >= 0 & a - c >= 0 & a - d >= 0) {
            return "4 kubeliai - win";
        } else {
            return "4 kubeliai - Lost";
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nejbolit
 */
public class Zadanie_7 {
     public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //x = x * 3;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

}

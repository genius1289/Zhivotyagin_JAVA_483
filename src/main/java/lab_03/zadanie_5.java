/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03;

/**
 *
 * @author Zhivotyagin
 */
public class zadanie_5 
{
    public static double k(double c, double a)
    {
        double b=Math.sqrt(c*c-a*a);
        return b;
    }
    public static void main(String[] args) {
        System.out.println(k(5,4));
    }
}
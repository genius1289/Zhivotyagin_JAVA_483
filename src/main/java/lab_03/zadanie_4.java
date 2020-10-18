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
public class zadanie_4 
{
    public static final double G=9.8; // задаю ненаследуюмую переменную
    public static double v(double h)
    {
        double t=Math.sqrt(2*h/G); // расчет времени падения
        return(t);
    }
    public static void main(String[] args) {
        System.out.println(v(100)); // задаю высоту
    }
}

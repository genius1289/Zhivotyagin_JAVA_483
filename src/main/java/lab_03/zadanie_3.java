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
public class zadanie_3 
{
    public static void s(double x, double y)// функция суммы
    {
        System.out.println(x+y);    
    }
    public static void r(double x, double y)// функция разности
    {
        System.out.println(x-y);
    }
    public static void p(double x, double y)// функция произведения
    {
        System.out.println(x*y);
    }
    public static void main(String[] args) 
    {
        double x=3,y=2;// задаю значение х и у для подсчета значений в сумме, разности и произведения
        s(x,y);// вызываю по очерди функции
        r(x,y);
        p(x,y);
        
    }
}

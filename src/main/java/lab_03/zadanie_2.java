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
public class zadanie_2 {
    public static Integer f(int n) 
    {
        int a =1;
        for (int i=1; i<=n; i++)
        {
            a*=i;
        }
        System.out.println(a);
        return(a);
    }
    public static void main(String[] args) {
        f(6); //факториал числа
    }
}

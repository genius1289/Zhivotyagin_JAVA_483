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
public class zadanie_1 {
    static int b=2; //число степень которого ищу
static void s (int n) { // функция степени числа
    int a =1;
    for (int i=0; i<n; i++)
        {
            a*=b;
        }
    System.out.println(a);
}
public static void main (String[] args) {
    s (2); //вызов функции степени числа и количество степеней числа b
}
}

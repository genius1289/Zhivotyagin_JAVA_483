/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5;

/**
 *
 * @author Zhivotyagin
 */
import java.util.Scanner;
public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String a="";
          switch(num){
              case 0:
                a="Ноль";
                break;
              case 1:
                a="Один";
                break;
              case 2:
                a="Два";
                break;
              case 3:
                a="Три";
                break;
              case 4:
                a="Четыре";
                break;
              case 5:
                a="Пять";
                break;
              case 6:
                a="Шесть";
                break;
              case 7:
                a="Семь";
                break;
              case 8:
                a="Восемь";
                break;
              case 9:
                a="Девять";
                break;
          }
                  
        System.out.printf(a);
        in.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uroven_1;

/**
 *
 * @author Zhivotyagin N.D.
 */
import java.util.Scanner; // Предварительный импорт класса Scanner
public class Zadanie_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // Cоздание объекта класс Scanner c использованием объекта in класса System
        System.out.println("Введи число");
        int a=sc.nextInt(); // Присваивание переменной а значения при помощи метода nextint(), который прописан в классе Scanner
        sc.close(); // закрытие объекта sc
        System.out.println("Введенное число: " +a);
        System.out.println("Его квадрат = " +(a*a));
    }
}
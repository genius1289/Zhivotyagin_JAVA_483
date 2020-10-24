/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4;

/**
 *
 * @author Zhivotyagin
 */
public class Zadanie_2 {
    static double a=1;
    static void v(){
        
        System.out.println(a);
        for (double i=2;i<10001;i+=1){
            if ((i%2)==0){
                a-=1/(i);
                System.out.println( "Шаг" + i+" "+"-1/" +i+ "\n" +"a = "+ a );
            }else{
                a+=1/(i);
                 System.out.println("Шаг" + i+ " "+ "+1/"+i + "\n" + a );
            }
        }
        System.out.println("Подсчет выражения "+a);
    }
    public static void main(String[] args) {
        v();
    }
}

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
public class Zadanie_1 {
    public static void main(String[] args) {
        int a,b,c,n;        
        for (n=2; n<8 ;n++){
            System.out.println("Значение степени n" +n);
            for (c=1; c<=100;c++){
                for (a=1; a<= 100;a++){
                    for (b=1; b<=100;b++){
                        if (Math.pow(c, n) == Math.pow(a, n) + Math.pow(b, n)){
                            System.out.println(" c= "+c+" b= "+b+" a= "+a+" n= "+n);
                            System.out.println( Math.pow(c, n) + "= " + Math.pow(b, n)+ " + " + Math.pow(a, n));
                        }
                    }
                }  
            }          
        }         
    }
}


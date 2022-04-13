/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helooo;

import java.util.Scanner;

/**
 *
 * @author AHMAD SHAH FARHAN
 */
public class Helooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner (System.in);
        System.out.println("masukan bilangan pertama");
        a = input.nextInt();
        System.out.println("masukan bilangan kedua");
        b = input.nextInt();
        
        if (a>b) {
            System.out.println(a);
        }else if (a>b){
            System.out.println(b);
          }
        
       
    }
    
}

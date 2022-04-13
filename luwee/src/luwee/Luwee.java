/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luwee;

import java.util.Scanner;

/**
 *
 * @author AHMAD SHAH FARHAN
 */
public class Luwee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bil;
        System.out.println("program menetukN bilangan genap dan ganjil");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Bilangan = ");
        bil=input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan "+bil+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
        }
    
  }
        
        
    }
    


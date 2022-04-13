/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacea;

import java.util.Scanner;

/**
 *
 * @author AHMAD SHAH FARHAN
 */
public class interfaceeee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        InterfaceBB obj = new InterfaceB();
        System.out.println("===============");
        System.out.println("DAFTAR MENU: ");
        System.out.println("1. bakso");
        System.out.println("2. seblak");
        System.out.println("3. soto");
        System.out.println("4. rawon");
         System.out.println("===============");
        System.out.println("pilih nomor  makanan yang anda pesan: ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                obj.Bakso();
                break;
            case 2:
                obj.Seblak();
                break;
            case 3:
                obj.Soto();
                break;
            case 4:
                obj.Rawon();
                break;
            default:

        }

    }
    }
    

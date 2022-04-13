/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacea;

/**
 *
 * @author AHMAD SHAH FARHAN
 */
public abstract class interfaceBB implements interfaceAA {
    
    @Override
    public void bakso(){
        int harga = 8000;
        int uang = 0;
        int kembalian;
        
        System.out.println("anda memilih menu bakso dengan harga rp. " +harga);
        System.out.println("masukan nominal uang anda " +uang);
        uang = input.nextInt();
        if (harga == uang) {
            System.out.println("uang anda pas");
        }else if  (harga > uang ) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        }else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " +kembalian);
        }
        
    }
    @Override
    public void rawon(){
        int harga = 12000;
        int uang;
        int kembalian;
        System.out.println("anda memilih menu rawon dengan harga rp. " +harga);
        System.out.println("masukan nominal uang anda ");
        uang = input.nextInt();
        if (harga == uang) {
            System.out.println("uang anda pas");
        }else if  (harga > uang ) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        }else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " +kembalian);
        }
    }
    @Override
    public void seblak(){
      int harga =  15000;
      int uang = 0;
      int kembalian;
      System.out.println("anda memilih menu seblak dengan harga rp. " +harga);
        System.out.println("masukan nominal uang anda " +uang);
        uang = input.nextInt();
        if (harga == uang) {
            System.out.println("uang anda pas");
        }else if  (harga > uang ) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        }else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " +kembalian);
        }
    }
    @Override
    public void soto(){
        int harga = 12000;
        int uang;
        int kembalian;
        System.out.println("anda memilih menu bakso dengan harga rp. " +harga);
        System.out.println("masukan nominal uang anda ");
        uang = input.nextInt();
        if (harga == uang) {
            System.out.println("uang anda pas");
        }else if  (harga > uang ) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        }else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " +kembalian);
        }
    }
  }

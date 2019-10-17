/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan334.kalkulator;

/**
 *
 * @author ASUS
 */
public class PBO210118074LATIHAN334Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kalkulator kal = new kalkulator ();
        
        System.out.println("====Aplikasi Kalkulator Bilangan=====");
        System.out.println("Masukan Angka Ke-1 : ");
        Scanner input = new Scanner(System.in);
        kal.value1 = input.nextdouble();
        System.out.println("Masukan Angka Ke-2 : ");
        kal.value2 = input.nextdouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan());
        System.out.println("Hasil Perkurangan :" +  kal.kurangBilangan(););
        System.out.println("Hasil Perkalian   : " +  kal.kaliBilangan());
        System.out.println("Hasil Pembagian   :"  +  kal.bagiBilangan());
        System.out.println("Hasil Sisa : " = kal.sisaBilangan());
        
        System.out.println("Developed by FIkri Maulana");
        
        
        
    }
    
}

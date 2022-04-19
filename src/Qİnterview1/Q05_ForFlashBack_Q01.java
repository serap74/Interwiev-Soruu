package Qİnterview1;

import java.util.Scanner;

public class Q05_ForFlashBack_Q01 {


    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle girin");
        String cumle= scanner.nextLine().toLowerCase();

        System.out.println("bir harf giriniz");
        char harf= scanner.next().toLowerCase().charAt(0);

        int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {

            if(cumle.charAt(i)==harf){
                sayac++;

            }

        }
        System.out.println("Girdiginiz cumlede " + harf +" karakteri "+ sayac+ " kere kullanilmistir");
    }
}

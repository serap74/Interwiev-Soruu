package Qİnterwiev5;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    /*Kullanıcıdan bir tamsayı girmesini isteyin.
    Tam sayı 100'den küçükse, kullanıcıya "Won!" Deyin.
     Aksi takdirde kullanıcıya "Kayıp!" deyin.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi=0;

        do {
            System.out.println("bir sayi girin");
            sayi=scan.nextInt();
             if(sayi<100){
                 System.out.println("WON");
             }

        }while(sayi<100);
        System.out.println("KAYIP");


    }
}

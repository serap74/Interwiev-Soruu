package Qİnterwiev5;

import java.util.Scanner;

public class Q02_PrintEvenNumber {

    /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.

   (Bir tamsayı argümanını kabul eden isEven adında bir yöntem yazın.
    Argüman çift ise yöntem true, aksi takdirde false döndürmelidir.)
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println(isEvenCift(sayi));
    }

    private static boolean isEvenCift(int sayi) {
        if (sayi%2==0) return true;
        else return false;
    }
}

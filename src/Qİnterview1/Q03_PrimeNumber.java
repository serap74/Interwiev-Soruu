package Qİnterview1;

import java.util.Scanner;

public class Q03_PrimeNumber {

     /*

    Kullanıcıdan pozitif bir sayı girmesini
    isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir sayi giriniz");
        int sayi=scan.nextInt();

        boolean asalMı=true;

        if(sayi>2){
            for (int i = 2; i <sayi ; i++) {
               if(sayi%i==0){
                   asalMı=false;
                   break;

               }
            }
            if(asalMı) System.out.println("sayi asaldir");
            else System.out.println("sayi asal degildir");

        }else System.out.println("sayi asal degildir");
    }

}

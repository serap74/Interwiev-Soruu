package Qİnterwiev5;

import java.util.Scanner;

public class Q03_CountFactors {

    /*Java kodunu while döngüsünü kullanarak yazın,
    Kullanıcı tarafından girilen bir tamsayının çarpanlarını sayan
    bir program yazın. 12'nin çarpanları = 1, 2, 3, 4, 6, 12 ==>
     6 8'in çarpanları = 1, 2, 4, 8 ==> 4
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("carpanlarini bulmak istediginiz sayiyi giriniz :");
        int sayi=Math.abs(scan.nextInt());

        int i=1;
        int sayac=0;
        while(i<=sayi){
            if(sayi%i==0){
                sayac++;
                System.out.print(i + " ");
            }
        i++;
        }
        System.out.println("sayinin pozitif carpanlarinin sayisi :" + sayac);
        System.out.println("sayinin negatif carpanlarinin sayisi :" + sayac);
        System.out.println("sayinin tumcarpanlarinin sayisi :" + sayac);
    }

}

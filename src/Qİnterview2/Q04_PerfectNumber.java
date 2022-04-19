package Qİnterview2;

import java.util.Scanner;

public class Q04_PerfectNumber {

       /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();

        mukemmelSayi(sayi);
        System.out.println("********************");
        girilenSayiyaKadarOlanMukemmelSayi(sayi);


    }

    private static void girilenSayiyaKadarOlanMukemmelSayi(int girilensayi) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        girilensayi = scan.nextInt();

        int toplam=0;
        for (int i = 1; i < girilensayi ; i++) {
            for (int j = 1; j < i; j++) {

                if((i&j)==0){
                    toplam=toplam+j;
                }

            }
            if (toplam==i){
                System.out.println(i + "mukemmel sayidir");
            }
            toplam=0;
        }



    }




    private static void mukemmelSayi(int sayi) {

        int toplam=0;
        for (int j = 1; j <sayi ; j++) {

            if(sayi%j==0){
                toplam+=j;
                System.out.println(j + " ");
            }

        }

        System.out.println();

        if(toplam==sayi){
            System.out.println(sayi + "mukemmel sayidir\n");
        }else System.out.println(sayi + "mukemmel sayi degildir..");


    }
}

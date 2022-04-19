package Qİnterwiev5;

import java.util.Scanner;

public class Q01_UsingDoWhilePrintNumber {

      /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20

        (int 100'den küçükken bir int yap yap,
         sayı artışını 5'er yazdır, örneğin: 0 5 10 15 20)
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        do {
            System.out.print(sayi + " ");
            sayi+=5;
        }while (sayi<100);
    }

}

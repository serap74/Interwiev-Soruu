package Qİnterview1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharacters {

     /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str=scan.nextLine();

        //split

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        //sort

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //sayac
        int counter=0;

        for (int i = 1; i <arr.length ; i++) {

            if(arr[i-1].equals(arr[i])){
                counter++;

            }else {
                System.out.println(arr[i-1] + "sayisi" + (counter+1));
                counter=0;
            }
            if(i==arr.length-1){
                System.out.println(arr[i] + "sayisi" + (counter+1));
            }
        }













    }
}

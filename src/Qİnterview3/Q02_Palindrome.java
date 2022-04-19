package Qİnterview3;

import java.util.Scanner;

public class Q02_Palindrome {

     /*

        Kulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String ifade=scan.nextLine();


        palindromWithStringBuilder(ifade);
        palindromeWithForLoop(ifade);
    }

    private static void palindromWithStringBuilder(String str) {
        StringBuilder sb=new StringBuilder();
        String tersStr =sb.reverse().toString();
        if(tersStr.equalsIgnoreCase(str)){
            System.out.println("Girilen ifade palindromedur -> " +tersStr);
        }else System.out.println("Girilen ifade palindrom degildir -> " +tersStr);







    }

    private static void palindromeWithForLoop(String str) {
        String tersStr="";

        for (int i = str.length()-1; i <=0 ; i--) {
            tersStr+=str.charAt(i);

        }
        System.out.println("tersStr = " + tersStr);
        if(tersStr.equalsIgnoreCase(str)){
            System.out.println("Girilen ifade palindromedur -> " +tersStr);
        }else System.out.println("Girilen ifade palindrom degildir -> " +tersStr);
    }
}

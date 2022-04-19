package Qİnterwiev5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    /*Kullanıcıdan String alın ve konsolda
    String içinde sadece sesli harfleri (aeiou) yazdırın
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str= scanner.nextLine().toLowerCase();

        //1.yol

        int index=0;
        while(index<str.length()){
            char c=str.charAt(index);
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                System.out.print(c);
            }
            index++;
        }

        //2.yol

        String s=str.replaceAll("[^aeiou]","");
        System.out.println(s);
    }
}

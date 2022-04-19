package Qİnterwiev5;

public class Q06_MultipleMethodVarargs {

    /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */
    public static void main(String[] args) {

        ortalamaBul("Ali", 55,60,70,82,75,69);
        ortalamaBul("Ayse", 55,60,70,82);
        ortalamaBul("Ahmet", 55,60,70);
        ortalamaBul("Yusuf", 55,60,70,82,75);

    }


    public static void ortalamaBul(String isim,double...notlar){

       double toplam=0;
       for (double each:notlar){
           toplam+=each;

       }
        System.out.println(isim + "-> not ortalamasi : " + toplam/notlar.length);
    }
}

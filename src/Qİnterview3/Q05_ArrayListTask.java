package Qİnterview3;

import java.util.ArrayList;

public class Q05_ArrayListTask {

    // Part1:
    //Dizelerin bir dizi listesini oluşturun -
    // "Kırmızı", "Yeşil", "Mavi", "Sarı" ve "Siyah" içindeki
    // tüm öğeleri yazdırın, her öğe yeni satırda

    // Part2:
    //Bir String dizi listesini ve bir String'i parametre
    // olarak kabul eden bir yöntem oluşturun,
    // öğeyi dizi listesinin ilk dizinine eklemelidir.

    // Part3:
    //Son öğeden önce öğe eklemesi gereken parametre olarak
    // bir String dizi listesi ve bir String kabul eden bir
    // yöntem oluşturun: [1, 2, 3] -> [1, 2, 4, 3]

    public static void main(String[] args) {
        //Part1
        ArrayList<String>renkler=new ArrayList<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Yellow");
        renkler.add("Black");

        for (int i = 0; i < renkler.size(); i++) {
            System.out.println(renkler.get(i));

        }

        System.out.println(renkler);



        //Part2

        İlkİndexEkle(renkler,"white");
        System.out.println(renkler);


        //Part3
        sonİndexEkle(renkler,"pink");
        System.out.println(renkler);




    }

    private static void sonİndexEkle(ArrayList<String> renkler, String pink) {
        renkler.add(renkler.size()-1,pink);
    }

    private static void İlkİndexEkle(ArrayList<String> renkler, String white) {
        renkler.add(0,white);
    }
}

package Qİnterview3;

public class Q06_MultiDimensolArray {

    /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */

    public static void main(String[] args) {

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        elemanSayisi(arr);
    }

    private static int elemanSayisi(int[][] arr) {
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sayac++;

            }

        }
        return sayac;
    }

}

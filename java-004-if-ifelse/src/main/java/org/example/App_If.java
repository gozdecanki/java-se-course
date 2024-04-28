package org.example;

public class App_If {
    public static void main(String[] args) {

        System.out.println("----If----");
        int sayi = 10;

        if (sayi > 5) {
            System.out.println("Benim sayım: " + sayi);
        }


        System.out.println("----If Else----");
        int yas = 22;

        if (yas >= 18) {
            System.out.println("Sağlıyor, yaş durumu : " + yas);
        } else {
            System.out.println("Sağlamıyor, yaş durumu : " + yas);
        }


        System.out.println("----If - Else If - Else ----");
        int puan = 60;

        if (puan <= 100 && puan >= 85) {
            System.out.println("5 :" + puan);
        } else if (puan < 85 && puan >= 70) {
            System.out.println("4 :" + puan);
        } else if (puan < 70 && puan >= 55) {
            System.out.println("3 :" + puan);
        } else if (puan < 55 && puan >= 45) {
            System.out.println("2 :" + puan);
        } else {
            System.out.println("1 :" + puan);
        }


    }
}
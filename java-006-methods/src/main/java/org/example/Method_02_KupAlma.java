package org.example;

public class Method_02_KupAlma {
    public static void main(String[] args) {

      /*  int tamSayi = 2;
        float floatSayi = 2.123456f;
        double doubleSayi = 2.123456789789;
*/
        float sonuc = kupAl(2.0f);

        System.out.println("Sonuc 1: " + sonuc);

        int sonuc2 = kupAl(2);

        System.out.println("Sonuc 2: " + sonuc2);

        float sonuc3 = kuvvetAl(2.0f,5);

        System.out.println("Sonuc 3: " + sonuc2);
    }

    private static float kupAl(float myNumber) {

        return myNumber * myNumber * myNumber;
    }
    private static int kupAl(int myNumber) {

        return (int) Math.pow(myNumber,3);
    }


    private static float kuvvetAl(float myNumber, int kuvvet) {

        return (float) Math.pow(myNumber,kuvvet);
    }
}

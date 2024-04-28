package org.example;

public class Method_01 {

    static int f(int x) {
        return 2 * x + 3;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        cizgiCiz();
        int y = f(1);

        System.out.println("Sonuc:" + y);

        cizgiCiz();
    }

    private static void cizgiCiz() {
        System.out.println("------------------------------");
    }


}
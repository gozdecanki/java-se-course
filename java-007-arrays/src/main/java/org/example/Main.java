package org.example;

public class Main {
    public static void main(String[] args) {


        int sayi1 = 10;
        int sayi2 = 15;
        int sayi3 = 20;
        int sayi4 = 35;

/* array definition
        int [] sayilar = {10, 15, 20, 35};

        int[] sayilar = {10, 15, 20, 35};

        int sayilar [] = {10, 15, 20, 35};

        int sayilar[] = {10, 15, 20, 35};
 */

        int[] sayilar = {10, 15, 20, 35};

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }


        short myArray[] = new short[4];
    /*

        myArray[0] = 21;
        myArray[1] = 22;
        myArray[2] = 23;
        myArray[3] = 24;
*/

/*
2 tane byte tipini toplarsak int e eşitlememk lazım
2 tane short tipini toplarsak yine int e eşitlemek lazım
1 byte ve 1 short topladığımızda da int e eşitlmek lazım
* */
//        short a = 30;
//        short b = 32752;
//        int c = a + b;

//        short a = 30;
//        byte b = 20;
//        int c = a + b;
        System.out.println("------------------------");
        for (short i = 0; i < myArray.length; i++) {
            myArray[i] = (short) (i + 21);
            System.out.println(myArray[i]);
        }


        System.out.println("----ÇOK BOYUTLU DİZİLER---");

//        System.out.println("---D---");
//        int [] myNumberArr = new int[3];
//        for (int i = 0; i < 3; i++) {
//            myNumberArr[i] = i ;
//            System.out.println(myNumberArr[i]);
//        }

        System.out.println("---2D---");
        //     int [][] myNumberArr = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i : " + i + "     " + "j: " + j);
            }
        }

        System.out.println("---3D---");
      //  int[][][] myNumberArr = new int[3][5][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println("i : " + i + "    " + "j: " + j + "    " + "k: " + k);
                }
            }
        }

    }
}
package org.example;

public class App_Switch {
    public static void main(String[] args) {


        int secilen=5;

//        switch (secilen){
//            case 0:
//                System.out.println("Gidilecek Menu : " + secilen);
//                break;
//            case 1:
//                System.out.println("Gidilecek Menu : " + secilen);
//                break;
//            case 2:
//                System.out.println("Gidilecek Menu : " + secilen);
//                break;
//            case 3:
//                System.out.println("Gidilecek Menu : " + secilen);
//                break;
//
//            default:
//                System.out.println("Ana menuye gidilecek.");
//                break;
//        }

        System.out.println("--------");

        int num=0;// 0 ı seçip, breakları kaldırısak , aşağı doğru inmeye devam eder taki case 2 deki breaki görene kadar hepsini yazar
    /*  Gidilecek Menu : 0
        Gidilecek Menu : 0
        Gidilecek Menu : 0
*/
        switch (num){
            case 0:
                System.out.println("Gidilecek Menu : " + num);
               // break;
            case 1:
                System.out.println("Gidilecek Menu : " + num);
             //   break;
            case 2:
                System.out.println("Gidilecek Menu : " + num);
               break;
            case 3:
                System.out.println("Gidilecek Menu : " + num);
                break;

            default:
                System.out.println("Ana menuye gidilecek.");
                break;
        }

    }
}
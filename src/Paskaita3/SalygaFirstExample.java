package Paskaita3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-06.
 */
public class SalygaFirstExample {
    public static void main(String[] args) {

        int a = 40;
        int b = 40;

        if(a>=b){
            System.out.println("Taip tai tiesa");

        }else {
            System.out.println("Netiesa");
        }

        System.out.println("Value is >> " + (a < b ? 120: 100));

        if(a < b){
            System.out.println("tiesa");
        }else if (a!=b){
            System.out.println("tiesa2");
        }else {
            System.out.println("Ne");
        }

        int val = 3;
        switch (val){
            case 1:
                System.out.println("radom 1");
                break;
            case 2:
                System.out.println("radom 2");
                break;
            default:
                System.out.println("Nieko nerado");
                break;
        }

        exeptionExample();   // metodo iskvietimas
        masExample();
    }

    private static void masExample(){

        int[] mas = new int[3];
        //reiksmes idejimas i masyva
        mas[0] = 12;
        mas[1] = 1;
        mas[2] = 5;
        //reiksmes paemimas is masyvo
        System.out.println("pirma reiksme yra " + mas[0]);
        printMas(mas);
    }

    private static void printMas(int[] masyvas){
        for(int i = 0; i < masyvas.length; i++){
            System.out.println("mas[" +i+ "] yra >>" + masyvas [i]);

        }

    }

    private static void exeptionExample(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite tik skaiciu!!!");
        try {int numb = sc.nextInt();
            System.out.println("Jusu skaicius yra " + numb);

        }catch (InputMismatchException e){
            System.out.println("Juk prasiau ivesti skaiciu!");

        }

    }
    //stringu palyginimas
    private static boolean isStringEquals (String first, String second){
        return first.equals(second);
    }
}

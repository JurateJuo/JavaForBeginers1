package Paskaita1;

import java.util.Scanner;

/**
 * Created by acmenukas on 2017-04-04.
 */
public class FirstExample {

    public static void main (String[] arg) {
        System.out.println("Hi Jurate");
        FirstExampleSupportClass example = new FirstExampleSupportClass();
        example.sayHi();
        int sum = example.sum(10, 20);
        //System.out.println(example.sum(10, 20));
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Please insert a number");
        int insertedNumb = scanner.nextInt();
        System.out.print("Inserted number >>" + insertedNumb);*/

      /* example.userName(scanner);*/
      /* example.userNameLenght(scanner);*/
        example.userNameVeiksmai(scanner);
        System.out.println(sum);



    }

}

class FirstExampleSupportClass{

    public void userNameVeiksmai (Scanner veik){
        System.out.println("iveskite pirma skaiciu");
        int first = veik.nextInt();
        System.out.println("iveskite antra skaiciu");
        int second = veik.nextInt();

    }

    public void userNameLenght(Scanner jj){
        System.out.println("Please insert your name");
        String name = jj.nextLine();
        System.out.println("Vardo ilgis yra " + name.length() + " raides");

    }

    public void userName(Scanner sc){
        System.out.println("Please insert your name :)");
        String name = sc.nextLine();
        System.out.println("Hi " + name);

    }

    public void sayHi(){
        System.out.println("Labas");
    }

    public int sum(int firstNumb, int secondNum){
        return firstNumb + secondNum;
    }
    public int minus(int firstNumb, int secondNum){
        return firstNumb - secondNum;
    }

}


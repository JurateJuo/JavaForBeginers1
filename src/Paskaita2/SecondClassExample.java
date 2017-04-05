package Paskaita2;

/**
 * Created by acmenukas on 2017-04-05.
 */
public class SecondClassExample {

    public static void main(String[] args) {
        //kaip priskirti reiksme
        //int nurodome tipa, pvz (int, double, string, boolean ir t.t.)
        // x - jusu lokalaus kintamojo vardas (nors ir petras :)) visada prasideda mazaja raide
        // 20 - svekas skaicius rasomas pagal nurodyta tipa
        int x = 20;
        boolean isYouCanDrink = false;
        String name = "Petras or Sigis"; // reiksme visada rasoma kabutese
        char a = 'a'; // chare'e visada viengubos kabutes

        //System.out.println naudojamas tik tada kai norime atspausdinti reisme i console. LN nukelia i nauja eilute
        System.out.println("Petras");
        example2(); //statinio metodo iskvietimas
        SecondClassExample className = new SecondClassExample();
        className.example3(); //nestatinio metodo iskvietimas
    }


    //metodas nieko negrazina
    public static void example2(){
        //cia metodo turinys kuris atliekamas kai yra iskvieciamas metodas
    }

    public void example3(){

    }
}

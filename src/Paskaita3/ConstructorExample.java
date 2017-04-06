package Paskaita3;

/**
 * Created by acmenukas on 2017-04-06.
 */
public class ConstructorExample {
    //tuscias konstruktorius visos klases turi pagal nutylejima tuscia konstruktoriu



    public ConstructorExample(){
        System.out.println("Tuscias konstruktorius");

    }

    //konstruktoriui perduodama reiksme vienas skaicius
    public ConstructorExample (int id){
        System.out.println("Antras konstruktorius su reiksme>>" + id);
    }



}



class MyMainApp{
    public static void main(String[] args) {
        ConstructorExample example = new ConstructorExample();
        ConstructorExample example1 = new ConstructorExample(123);

    }
}
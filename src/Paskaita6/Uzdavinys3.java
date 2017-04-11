package Paskaita6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by acmenukas on 2017-04-11.
 */

//Sukurti objekto klasę, kuri saugotų informaciją apie Vartotoją
// (vardas, pavardė, amžius, miestas). Parašyti metodą, kuris iš duotų parametrų
// (vardas, pavardė, amžius, miestas) sukurtų objektą ir įdėtų jį į kolekciją.
// Kolekcijos rezultatus atspausdinti ekrane.

//Naudojant sukurtą kolekciją, surikiuoti duomenis, naudojant
// Collections.sort ar sort metodą. Atspausdinti rezultatą ekrane.



//Rezultatus

public class Uzdavinys3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Uzdavinys3 uzd3 = new Uzdavinys3();
        uzd3.creatPerson(persons, "Petras", "Petraitis", 36, "Kaunas");
        uzd3.creatPerson(persons, "Jonas", "Jonaitis", 18, "Vilnius");
        uzd3.creatPerson(persons, "Onute", "Onaityte", 14, "Birstonas");

        Collections.sort(persons);

        uzd3.spausdinti(persons);
        
    }
    private void spausdinti(List<Person> list){

        for (Person p : list ){
            //System.out.println(p.getVardas() + " " + p.getPavarde()+ " " + p.getAmzius() + " " + p.getMiestas());

            System.out.println(p);     //spausdina pagal toString metoda
        }

    }

    private void creatPerson(List<Person> zmones, String vardas, String pavarde, int amzius, String miestas) {

        Person p = new Person(vardas, pavarde, amzius, miestas);
       /* p.setVardas(vardas);
        p.setPavarde(pavarde);
        p.setAmzius(amzius);
        p.setMiestas(miestas); */

        zmones.add(p);

    }
}

class Person implements Comparable<Person>{
    private String vardas;
    private String pavarde;
    private int amzius;
    private String miestas;


    //cia yra konstruktorius
    public Person (String vardas, String pavarde, int amzius, String miestas){
        this.vardas = vardas;     // naudosim klases lygio kintamaji
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.miestas = miestas;

    }

    @Override
    public String toString() {
        return "Person{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", miestas='" + miestas + '\'' +
                '}';
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    @Override
    public int compareTo(Person o) {
        return miestas.compareTo(o.getMiestas());
    }
}

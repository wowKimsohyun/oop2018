package week12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static void main (String[] args){

        Person ps1 = new AlonePerson("Ryan");
        Family parentFamily = new Family("James", "Hana");
        Family family = new Family("Kai","Scopion");
        Family family1 = new Family("Asuna","Kirito");
        Family family2 = new Family("Da-xua","20GG");
        Family family3 = new Family("Hashagi","NotEnoughMana");
        Family family4 = new Family("Ayanokouji", "Horikita");
        Person psF1 = new AlonePerson("Sakura");
        Person psF2 = new AlonePerson("Akame");
        Person psF3 = new AlonePerson("Naruto");
        Person psF4 = new AlonePerson("Sasuke");

        Family family5 = new Family("Sadara","Boruto");
        Person psF5 = new AlonePerson("Akatsuki");

        family1.addChilden(psF1);
        family2.addChilden(psF2);
        family3.addChilden(psF3);
        family4.addChilden(psF4);

        family5.addChilden(psF5);
        family2.addChilden(family5);


        family.addChilden(family1);
        family.addChilden(family2);
        family.addChilden(family3);
        family.addChilden(family4);
        parentFamily.addChilden(ps1);
        parentFamily.addChilden(family);
        parentFamily.print();



    }
}

abstract class Person {

    public abstract void addChilden(Person person);
    public abstract Person getChild(int i);
    public abstract String getName();
    public abstract void print();
    public abstract void printAloneSoSad();
    public abstract void printFamilyHas2Son();
}

class Family extends Person{

    private String husband;
    private String wife;

    public Family(String husband, String wife){

        this.husband = husband;
        this.wife = wife;
    }

    List<Person>  family = new ArrayList<Person>();

    public boolean getdepth(){

        return true;
    }

    @Override
    public void addChilden(Person person) {

        family.add(person);
    }

    @Override
    public Person getChild(int i) {
        return family.get(i);
    }

    @Override
    public String getName() {
        return husband+" "+wife;
    }

    @Override
    public void print() {

        System.out.println("---------------------");
        System.out.println("Name: "+getName());
        System.out.println("---------------------");

        Iterator<Person> personIterator = family.iterator();
        while(personIterator.hasNext()){

            Person person = personIterator.next();
            person.print();
        }
    }

    @Override
    public void printAloneSoSad(){

        Iterator<Person> personIterator = family.iterator();
        while(personIterator.hasNext()){

            Person person = personIterator.next();
            person.printAloneSoSad();
        }
    }

    @Override
    public void printFamilyHas2Son() {

        if (family.size() == 2){

            System.out.println(getName());
        }

        Iterator<Person> personIterator = family.iterator();
        while(personIterator.hasNext()){

            Person person = personIterator.next();
            person.printFamilyHas2Son();

        }


    }
}

class AlonePerson extends Person{

    String name;

    public AlonePerson(String name){

        this.name = name;
    }

    @Override
    public void addChilden(Person person) {
        //Nothing he/she alone so sad :(((
    }

    @Override
    public Person getChild(int i) {
        // R u kidding me she/he just lone :((
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("---------------------");
        System.out.println("Name: "+getName());
        System.out.println("---------------------");
    }

    @Override
    public void printAloneSoSad() {
        print();
    }

    @Override
    public void printFamilyHas2Son() {
        // why u been here, he/she is alone so sad :((
    }
}
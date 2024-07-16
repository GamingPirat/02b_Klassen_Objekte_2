package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung  --> Erzeugen eines Objektes
        // System.out.println(new Cat());

        // cat --> Referenzvariable
        // Cat --> Referenztyp(Klasse)
        Cat cat = new Cat("Grizabella", "white", 29);
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.getInstanceVariable());


        // Werte ausgeben
        output(cat.getName());
        output(cat.getFurColor());
        // output("age: " + cat.age);
                // Explizite Typumwandlung
        // output(String.valueOf(cat.age)); // age wird in String konvertiert
        output(Integer.toString(cat.getAge())); // age wird in String konvertiert
                
        System.out.println("----------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);

        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVariable());

                // Werte ausgeben
                output(cat2.getName());
                output(cat2.getFurColor());
                // output("age: " + cat.age);
                        // Explizite Typumwandlung
                // output(String.valueOf(cat.age)); // age wird in String konvertiert
                output(Integer.toString(cat2.getAge())); // age wird in String konvertiert
        cat2.setAge(36);
        output(Integer.toString(cat2.getAge())); // age wird in String konvertiert


    }

      // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
   
}


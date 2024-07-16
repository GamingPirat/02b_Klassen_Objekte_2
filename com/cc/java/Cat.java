package com.cc.java;

public class Cat {

    private String name;// pass by reference
    private String furColor;
    private int age;    // pass by value

    // Konstruktor (keinen Rückgabetyp)
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

    /* Getter */
    public String getName() {
        if (getPermission()) {
            return name;
        } else {
            return "Sorry, no permission!";
        }
        
        
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    /* Setter */
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean getPermission() {
        // return true;
        return false;



    }
}
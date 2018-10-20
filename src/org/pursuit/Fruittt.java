package org.pursuit;
////

//Oct 10 review
//class - creates bluprint for object
public class Fruittt {//class cld fruittt
    private  String name;//charcteristics//4 private fields
    private  String color;
    private  String flavor;
    private int seedCount;


    public Fruittt(String name, String color, String flavor, int seedCount) {//constructor , instanrtiaate bf calling
        this.name = name;
        this.color = color;
        this.flavor = flavor;
        this.seedCount = seedCount;//conS sets valuess


    }
//methods go outside of constructor
    public void printCharacteristics() {//method can print assign val call other methods or return a val
        System.out.println("I am a " + name + " my color is " + color + ". I am a " + flavor + ". I have " + seedCount + "seeds.");

    }//since its in the same class. xclusive to scope of the method. //doesn't know that the name in parameter exists.


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setSeedCount(int seedCount) {
        this.seedCount = seedCount;
    }


}

//override static vs non static methods from the parent is diff , if u override the static hiding the static method from the parent
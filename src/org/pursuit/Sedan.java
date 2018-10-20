//package org.pursuit;
//
//public class Sedan extends Car {
//    //car parent class
//
//    public  static int counter;//static not specific to an instance it exists across all instancres
//    private int  windows = 4;
//    private static int wheels = 4;
//    private static String  somename = "Sedan";
//
//
//    public Sedan(String make,
//                 String model) {
//        super(make, model);//does into car class and runs consructor -calls the parent methods
//        counter++;
//
//
//    }
//
//
//
//    @Override
//    public String getMake() {
//        return super.getMake();
//    }
//    public  void  setWheels (int wheels){
//        this.wheels = wheels;
//    }
//
//        public static String getWheels (){
//        return wheels;
//    }
//
//    public static String getClassNAme (){
//        return className;
//    }
//}
//
////
////child - extender class parent - super class
////--what does every class in java extend from- object / except for primitives --even subclassses
////object baes building bloc--object way of organizing data in java
////all classes are objects
////can only extend one thing
////subclass inehrits all public and protected methods from its parent  //private methods so child cant access
////pacakhe folder to access classses
////creare new methids in subclasses, parent can't access, can add to the constructor
////subclasses can be extended
//
//// static methods so u dont have to creat an instance from helper class -static methods used as helper methods
//

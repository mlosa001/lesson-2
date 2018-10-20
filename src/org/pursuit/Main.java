package org.pursuit;

public class Main {

    public static void main(String[] args) {
        Vehicle accord = new Vehicle("Honda", "Accord");
        accord.drive(30);
        accord.wipeWin(11);
    }






        printTriangle();
        //XO("xoox");

//        String input = "GeeksForGeeks";
//
//        // convert String to character array
//        // by using toCharArray
//        char[] try1 = input.toCharArray();
//
//        for (int i = try1.length-1; i>=0; i--)
//            System.out.print(try1[i]);


    // write your code here
//
//        Integer number = 4;
//        Boolean tru = true; //field stores this value
//        Boolean tru = new Boolean (true) //field stores this value
//        Boolean value = truth;
//        System.out.println(value);

////        int num2 = Integer.parseInt("10");
////
////        int number = 5; //store 5 in ram
////        Integer numebr  = 5; //stores var in HDD
//        Fellow fellow  = new  Fellow("ameria" );
//
//        int value = Integer.parseInt( "6");
//
//        public static int parseInt ( String "")
//        //System.out.println(fellow.getName());
//        //command click gives u source code , oracle effective java

//        String stringNumber = 1000;
//        int value = Integer.parseInt(stringNumber);
//        System.out.println(value);
//
//        try {
//            String stringNumber = "1000cats";
//            int value = Integer.parseInt(stringNumber);
//            System.out.println(value);
//        } catch (NumberFormatException nfe) {//lookout for a specific error
//            nfe.printStackTrace();
//            System.out.println("uhg");
//        }


//staic method  - method belonging to a class
//exception handling occurs during execution of prog. disrupting it -
//
//            public static void main(String[] args) {
//                Fruit apple = null;
//                System.out.println(apple.getName());
//
//
//    Fruit apple = null;
//if(apple != null) {
//        System.out.println(apple.getName());
//
//        System.out.println(convertStringToInteger("hi"));
//        System.out.println(convertStringToInteger("10"));
//
//    }
//
//    public static int convertStringToInteger(String word){
//        try {
//            int number = Integer.parseInt(word);
//            return number;
//
//        } catch (NumberFormatException e){
//            e.printStackTrace();
//            return 0;
//        }
//
//    }
//lesson 10/10
//     Object object = new Object();
//     Perrson person = new Perrson();
//        System.out.println(person.toString());
//
//    }

//
//public static int CatchPointerException(String word){
//
//
//        try {
//
//           String ho = null;
//            System.out.println();
//
//        } catch (NullPointerException e) {
//            System.out.println("uhg !");
//            e.printStackTrace();
//
//
//       }

//    Car somecar = new Car( "honda", "sedan");
//
//    Sedan ySedan = new Sedan( "honda", "yellow");
//    Sedan bSedan = new Sedan( "honda", "blue");
//    Sedan yeSedan = new Sedan( "honda", "yellow"){
//    }
//}

//object dynamic type non static , class definition blueprint stays the same
////static .. Fruit Orange object at compile doenst know .getcitrusfruit method, Orange orange at compile does know .citrusFruit
//Fruittt fruit = new Fruittt("Pear", "green", "bittersweet", 8);
//    Fruittt apple = new Apple("Apple", "red", "sweet", 8);
//    Orange  orange = new Orange("Orange", "orange", "acidic sweet", 12);
//    Fruittt peach = new Peach("Peach", "yellow", "sweet", 1);
//   fruit.printCharacteristics();
//        apple.printCharacteristics();
//        orange.printCharacteristics();
//        orange.citrusFruit();
//        peach.printCharacteristics();
//
//
//
//
//}








//HW!!!!!
        public  static boolean XO (String xoword){
        String arrayA = "";
        String arrayB = "";
        boolean isEqual = true;




            for( int i = xoword.length() -1; i >= 0; i--) {
//

                if (xoword.charAt(i) == 'o' || xoword.charAt(i) == 'O') {
                    arrayA += xoword.charAt(i);
                }
                if (xoword.charAt(i) == 'x' || xoword.charAt(i) == 'X') {
                    arrayB += xoword.charAt(i);

                }
            }

            if (arrayA.length() == arrayB.length()) {
                isEqual = true;
                } else {
                isEqual = false;
            }
return isEqual;
        }


        }

//
//        /// q 12
////        public  static void reverseString(String revWord){
////          for ( int a = revWord.length() - 1; a >= 0; a--){
////
////          }
//
//
//        }
//
//
//


//
//            Write a Java method called countCode that
// takes a String parameter, and returns the number of
// times that the string "code" appears anywhere in
// the given string, except we'll accept any letter for the
// 'd', so "cope" and "cooe" count.
//
//            For example:
//
//            countCode("aaacodebbb") → 1
//            countCode("codexxcode") → 2
//            countCode("cozexxcope") → 2

//
//    public static int countCode(String countw) {
//        int count = 0;
//
//        for (int i = 0; i < countw.length()-3; i++) {
//            if (countw.charAt(i + 1) == 'c' && countw.charAt(i+ 2) == 'o' && countw.charAt(i+3)  == 'e') {
//                count++;
//            }
//        }
//
//        return count;
//
//    }
//}
////q 7
//#
//        ##
//        ###
//        ####
//        #####
//        ######
//        #######

//    public static void printTriangle() {
//        String numString = "";
//
//        for (int i = 0; i <= 6; i++) {
//
//            numString = numString + "#";
//
//            System.out.println(numString );
//            //System.out.println(numString += "#");
//
//
//
//        }
//
//
//    }

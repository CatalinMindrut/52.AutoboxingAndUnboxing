package com.Catalin;

import java.util.ArrayList;

class intClass{
    private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] srtArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Catalin");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        /**This line returns an error because ArrayLists can only accept classes as parameters, not primitive data
         * types.
         */

        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));
        /** This will initialize the int Class inside the ArrayList and it will effectively add a new element to the
         * array list, an element of type intClass with the value of 54.
         * This works because intClass is actually a class not a primitive data type. The class has been created
         * above with a constructor, setter and getter.
         * An easier way would be this, by using the concept of autoboxing.
         * Normally we wrapping the value that we need, with a class. For example we need an int value, myValue, so
         * in order to use it we are wrapping the integer in a class called intClass with setters and getters.
         * Java actually has some features built in for this. For example classes made for the primitive data types:
         * Integer, Double, etc.
         */
//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.53);
        /**In Java 5 or higher, it is no longer required to initiate these classes.
         */
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        /**This will use the value of i and convert it from an integer, to an Integer class so it can be used in the
         * Array List. This is called autoboxing.
         */
        for(int i=0; i<= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
        /** This will convert back the i to a primitive data type.
         *
         * Seems that autoboxing and unboxing is no longer required in Java 5 and up. The above code can also be
         * written like this:
         */

        ArrayList<Integer> intNewArrayList = new ArrayList<Integer>();
        for(int i=0; i<= 10; i++){
            intArrayList.add(i);
        }
        for(int i=0; i<= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i));
        }

        /**There is an easier way to use these features:
         */
        Integer myIntValue = 45;
        /** At compile time, Java will actually do the hard work and the code will be interpreted as:
         * Integer myIntValue = Integer.valueOf(45);
         */
        int myInt = myIntValue;
        /** As before, at compile time, Java is converting the class to an int value and the code will be interpreted
         * as:
         * int myInt = myIntValue.intValue();
         */

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + "  --> " + value);
        }

    }
}

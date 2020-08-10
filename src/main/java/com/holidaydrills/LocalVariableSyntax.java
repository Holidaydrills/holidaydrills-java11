package com.holidaydrills;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LocalVariableSyntax {

    public void myFancyMethod() {
        String myString = "Hello";
        Map<String, String> myMap = new HashMap<>();
        Integer[] myArray = new Integer[10];
        double myDouble = 0.0;
        double mySecondDouble = 0.0;

        // Do something with all this variables
    }

    public void myFancyMethodWithVar() {
        var myString = "Hello";
        var myMap = new HashMap<String, String>();
        var myArray = new Integer[10];
        var myDouble = 0.0;
        var mySecondDouble = 0.0;

        // Do something with all this variables
    }

    public void var() {
        System.out.println("See, it is allowed to have var as method name");
    }

    public void varUsage() {
        for(var i = 0; i < 10; i++) {
            System.out.println("Print me ten times.");
        }

        int[] myIntegers = {0,1,2,3,4,5,6,7,8,9};
        for(var element : myIntegers) {
            System.out.println(element);
        }

        BiFunction<Integer, String, String> myFunction = (a, b) -> String.format("This is the Integer: %s, and this is the String: %s)", a,b);
        myFunction = (var a, var b) -> String.format("This is the Integer: %s, and this is the String: %s)", a,b);

        // Comiler Error: Cannot resolve symbol b
        //myFunction = (a, var b) -> String.format("This is the Integer: %s, and this is the String: %s)", a,b);

        // Compiler Error: Cannot mix 'var' and explicitly typed parameters in lambda expression
        //myFunction = (Integer a, var b) -> String.format("This is the Integer: %s, and this is the String: %s)", a,b);

        // Compiler Error: Cannot infer type: 'var' on variable without initialize
        //var houseNumber;

        //Compiler Error: Cannot infer type: variable initializer is 'null'
        //var lastName = null;

        int counterOne, counterTwo, counterThree = 0;
        //Compiler Error: 'var' is not allowed in a compound declaration
        //var counterOne, counterTwo, counterThree = 0;

        Function<String, String> myValidFunction = a -> a;
        //Compiler Error: Cannot infer type: lambda expression requires an explicit target type
        //var test = a -> a;

        BiFunction<Integer, Integer, Integer> myBifunction = Math::max;
        //Compiler Error: Cannot infer type: method reference requires an explicit target type
        //var anotherBiFunction = Math::max;

        int[] myArray = {1,2,3,4,5};
        // Compiler Error: Array initializer is not allowed here
        //var anotherArray= {1,2,3,4,5};
        // However this would work:
        var yetAnotherArray= new int[]{1, 2, 3, 4, 5};

    }

}

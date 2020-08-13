package com.holidaydrills;

import java.util.stream.Collectors;

public class StringApiEnhancements {
    public static void isBlankExample() {
        String emptyString = "";
        System.out.println(emptyString.isBlank()); // true

        String stringOfBlanks = "   ";
        System.out.println(stringOfBlanks.isBlank()); // true

        String notOnlyBlanks = "         not  only    blank   ";
        System.out.println(notOnlyBlanks.isBlank()); // false
    }

    public static void linesExample() {
        String multiLineString = "First line\nSecond line\nThird line";
        System.out.println(multiLineString);
        /*
        Output:
        First line
        Second line
        Third line
         */

        System.out.println(multiLineString.lines().collect(Collectors.toList()));
        /*
        Output:
        [First line, Second line, Third line]
         */
    }

    public static void repeatExample() {
        String stringThatShouldBeRepeated = "Jump!";
        System.out.println(stringThatShouldBeRepeated.repeat(5)); // Output: Jump!Jump!Jump!Jump!Jump!
    }

    public static void stripExample() {
        String myString = "   Hello there!    ";
        System.out.println(myString.strip()); // Output: "Hello there!"
        System.out.println(myString.stripLeading()); // Output: "Hello there!    "
        System.out.println(myString.stripTrailing()); // Output: "   Hello there!"

        String withUnicodeWhitespace = "\u2005\u2005Hello there!  \n\t";
        System.out.println(withUnicodeWhitespace.strip()); // Output: "Hello there!"
        System.out.println(withUnicodeWhitespace.trim()); // Output: "  Hello there!"
    }

}

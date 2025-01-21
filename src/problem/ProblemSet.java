package problem;

import java.util.ArrayList;
import java.util.HashMap;

public class ProblemSet {

    // checkSign
    //  This method takes a single integer as a parameter and returns a String
    //  representing the numeric sign of the input
    //  This String must be "positive", "negative", or "zero", and is case sensitive
    //  Examples:
    //      checkSign(5) returns "positive"
    //      checkSign(-2) returns "negative"
    //      checkSign(0) returns "zero"
    public static String checkSign(int num) {
        return "";
    }

    // greatestNumber
    //  This method takes three doubles as parameters and returns the double with the
    //  highest value
    //  Examples:
    //      greatestNumber(5.0, 10.0, 15.0) returns 15.0
    //      greatestNumber(0.0, -2.0, -1.5) returns 0.0
    //      greatestNumber(2.5, 2.3, 2.5) returns 2.5
    public static double greatestNumber(double n1, double n2, double n3) {
        return 0.0;
    }

    // longestStringIndex
    //  The longestStringIndex method has one parameter which is an ArrayList of
    //  Strings, and returns the index into that ArrayList of the String with the
    //  greatest length
    //  If the ArrayList is empty, this method should return -1, to signify that
    //  there were no valid indices
    //  If there are multiple Strings which share the greatest length, any of their
    //  indices can be returned and will be accepted by the tests
    //  Examples:
    //      longestStringIndex(["a", "abc", ""]) returns 1
    //      longestStringIndex([]) returns -1
    //      longestStringIndex(["harmonica", "cat", "something"]) returns 0 or 2


    // average
    //  The average method will take an ArrayList of Doubles as a parameter and
    //  returns the average of the values in the ArrayList as a double
    //  If the ArrayList is empty, the method should return 0.0
    //  Examples:
    //      average([1.0,2.0,3.0]) returns 2.0
    //      average([-5.0,5.0]) returns 0.0
    //      average([6.5,6.5,8.5,8.5]) returns 7.5
    //      average([]) returns 0.0


    // firstNInts
    //  This method takes a single integer n as an argument and returns an ArrayList
    //  of integers representing the first n natural numbers, starting with 1
    //  This means that if n is 0, the returned ArrayList should be empty
    //  Additionally, if n is negative, the returned ArrayList should also be empty
    //  Examples:
    //      firstNInts(1) returns [1]
    //      firstNInts(5) returns [1,2,3,4,5]
    //      firstNInts(0) returns []
    //      firstNInts(-10) returns []


    // sumOfDigits
    //  The sumOfDigits method will take an int as a parameter and returns the sum of
    //  the digits of the input as an int
    //  The sign of a number is ignored, i.e. -5 is treated the same as 5
    //  Examples:
    //      sumOfDigits(123) returns 6
    //      sumOfDigits(57) returns 12
    //      sumOfDigits(-36) returns 9


    // bestKey
    //  The bestKey method will take a HashMap of Strings to Integers as a parameter
    //  and returns the key which maps to the largest Integer
    //  If the HashMap is empty, the method should return the empty String
    //  The method may break ties arbitrarily, meaning that if two keys are mapped to
    //  the same highest value, either can be returned. The tests provided ensure
    //  that any valid solution will be accepted
    //  Examples:
    //      bestKey({"CSE": 100, "MTH": 90, "MGT": 10}) returns "CSE"
    //      bestKey({"cat": 5, "dog": 5, "fox": 4}) can return either "cat" or "dog"
    //      bestKey({}) returns ""

    
    // squareNumbers
    //  The squareNumbers method takes an ArrayList of Integers as a parameter and
    //  returns a HashMap of Integer to Integer. The keys of this HashMap will be the
    //  elements of the input ArrayList, and the value corresponding to each key is
    //  that element squared
    //  If the input is an empty ArrayList, the output should be an empty HashMap
    //  Do not worry about the case where there are multiple of the same value in the
    //  input; this is considered undefined behavior and will not be tested
    //  Examples:
    //      squareNumbers([1,2,3]) returns {1:1, 2:4, 3:9}
    //      squareNumbers([-5,4,0]) returns {-5:25, 4:16, 0:0}
    //      squareNumbers([]) returns {}


    // countOccurrences
    //  This method takes two parameters, an ArrayList of Integers and an int. It
    //  returns the number of times that that int appears in the ArrayList
    //  Examples:
    //      countOccurrences([4], 4) returns 1
    //      countOccurrences([1,-5,1], 1) returns 2
    //      countOccurrences([-4,52,-8,-4], 16) returns 0
    //      countOccurrences([], 5) returns 0

}

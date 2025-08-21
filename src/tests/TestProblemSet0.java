package tests;

import org.junit.Test;

import problem.ProblemSet0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestProblemSet0 {

    @Test
    public void testAverage() {
        HashMap<ArrayList<Double>, Double> testCases = new HashMap<>();

        // Create a hashmap of inputs and their expected output. This is a pattern that
        // is continued throughout the tests and is a habit you should get into when
        // writing your own tests
        testCases.put(new ArrayList<>(), 0.0);
        testCases.put(new ArrayList<>(Arrays.asList(1.1, 2.0, 3.9)), 2.33333333333);
        testCases.put(new ArrayList<>(Arrays.asList(1.0)), 1.0);
        testCases.put(new ArrayList<>(Arrays.asList(-1.0, 0.0, 1.0)), 0.0);
        testCases.put(new ArrayList<>(Arrays.asList(0.0)), 0.0);
        testCases.put(new ArrayList<>(Arrays.asList(-10.0, 5.5, 1.5, 2.3)), -0.175);
        testCases.put(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0)), 2.0);
        testCases.put(new ArrayList<>(Arrays.asList(-9.9)), -9.9);

        // Using our hashmap of inputs, we can iterate over it and ensure that the
        // inputs match with the expected outputs
        for (ArrayList<Double> input : testCases.keySet()) {
            double expected = testCases.get(input);
            double computed = ProblemSet0.average(input);
            assertEquals("Input: " + input, computed, expected, 1e-5);
        }
    }

    @Test
    public void testLongestStringIndex() {
        ArrayList<String> list = new ArrayList<>();
        assertEquals("Input" + list, -1, ProblemSet0.longestStringIndex(list));

        list.add("1");
        assertEquals("Input" + list, 0, ProblemSet0.longestStringIndex(list));

        list.add("4444");
        list.add("22");
        list.add("333");
        assertEquals("Input" + list, 1, ProblemSet0.longestStringIndex(list));

        list.add("666666");
        assertEquals("Input" + list, 4, ProblemSet0.longestStringIndex(list));
    }

    @Test
    public void testLongestStringIndexWithTies() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("first", "2nd", "third", "4th", "fifth"));
        int actual = ProblemSet0.longestStringIndex(list);
        assertTrue("Input" + list, actual == 0 || actual == 2 || actual == 4);

        list = new ArrayList<>(Arrays.asList("abc", "def", "excessivelyLongString", "anotherLongStringabcd"));
        actual = ProblemSet0.longestStringIndex(list);
        assertTrue("Input" + list, actual == 2 || actual == 3);
    }

    // Uncomment the following tests as you get to these methods. You can highlight
    // multiple lines and press control+/ (command+/ on mac) to quickly comment
    // multiple lines in/out

    // @Test
    // public void testSumOfDigits1() {
    //     int returned = ProblemSet0.sumOfDigits(123);
    //     int expected = 6;
    //     assertEquals(returned + " did not equal " + expected, expected, returned);
    // }

    // @Test
    // public void testSumOfDigits2() {
    //     HashMap<Integer, Integer> testCases = new HashMap<>();

    //     // Create a hashmap of inputs and their expected output. This is a pattern that
    //     // is continued throughout the tests and is a habit you should get into when
    //     // writing your own tests
    //     testCases.put(1, 1);
    //     testCases.put(0, 0);
    //     testCases.put(586, 19);
    //     testCases.put(1234567890, 45);
    //     testCases.put(-1234567890, 45);

    //     // Using our hashmap of inputs, we can iterate over it and ensure that the
    //     // inputs match with the expected outputs
    //     for (int input : testCases.keySet()) {
    //         int expected = testCases.get(input);
    //         int returned = ProblemSet0.sumOfDigits(input);
    //         assertTrue(returned + " did not equal " + expected, expected == returned);
    //     }
    // }

    // @Test
    // public void testSumOfDigits3() {
    //     HashMap<Integer, Integer> testCases = new HashMap<>();

    //     // Create a hashmap of inputs and their expected output. This is a pattern that
    //     // is continued throughout the tests and is a habit you should get into when
    //     // writing your own tests
    //     testCases.put(2, 2);
    //     testCases.put(12, 3);
    //     testCases.put(908, 17);
    //     testCases.put(-14, 5);
    //     testCases.put(-10, 1);

    //     // Using our hashmap of inputs, we can iterate over it and ensure that the
    //     // inputs match with the expected outputs
    //     for (int input : testCases.keySet()) {
    //         int expected = testCases.get(input);
    //         int returned = ProblemSet0.sumOfDigits(input);
    //         assertTrue(returned + " did not equal " + expected, expected == returned);
    //     }
    // }

    // @Test
    // public void testBestKey1() {
    //     HashMap<String, Integer> input = new HashMap<>();
    //     input.put("a", 1);
    //     input.put("b", 2);
    //     input.put("c", 3);
    //     input.put("d", 4);
    //     input.put("e", 5);
    //     String expected = "e";
    //     String computed = ProblemSet0.bestKey(input);
    //     assertTrue(computed.equals(expected));
    // }

    // @Test
    // public void testBestKey2() {
    //     HashMap<String, Integer> input = new HashMap<>();
    //     input.put("a", 1);
    //     String expected = "a";
    //     String computed = ProblemSet0.bestKey(input);
    //     assertTrue(computed.equals(expected));
    // }

    // @Test
    // public void testBestKey3() {
    //     HashMap<String, Integer> input = new HashMap<>();
    //     input.put("a", -3);
    //     input.put("b", -2);
    //     input.put("c", -3);
    //     input.put("d", -4);
    //     input.put("e", -5);
    //     String expected = "b";
    //     String computed = ProblemSet0.bestKey(input);
    //     assertTrue(computed.equals(expected));
    // }

    // @Test
    // public void testBestKeyMultipleBest() {
    //     HashMap<String, Integer> input = new HashMap<>();
    //     input.put("a", 1);
    //     input.put("b", 6);
    //     input.put("c", 3);
    //     input.put("d", 6);
    //     input.put("e", 5);
    //     ArrayList<String> expected = new ArrayList<>(Arrays.asList("b", "d"));
    //     String computed = ProblemSet0.bestKey(input);
    //     assertTrue(expected.contains(computed));
    // }

    // @Test
    // public void testBestKeyEmpty() {
    //     String actual = ProblemSet0.bestKey(new HashMap<>());
    //     assertEquals("", actual);
    // }

    // public static void compareHashMaps(HashMap<Integer, Integer> map1,
    //         HashMap<Integer, Integer> map2) {
    //     assertEquals(map1.size(), map2.size());
    //     for (int key : map1.keySet()) {
    //         assertTrue(map2.containsKey(key));
    //         assertEquals(map1.get(key), map2.get(key));
    //     }
    // }

    // @Test
    // public void testWordCount() {
    //     int actual = ProblemSet0.wordCount("data/word_count.csv");
    //     int expected = 12;
    //     assertEquals(expected, actual);

    //     actual = ProblemSet0.wordCount("data/word_count_long.csv");
    //     expected = 100;
    //     assertEquals(expected, actual);

    //     actual = ProblemSet0.wordCount("data/word_count_uneven.csv");
    //     expected = 81;
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void testWordCountNoFile() {
    //     int expected = 0;
    //     int actual = ProblemSet0.wordCount("file_does_not_existwahvdoiahvwdha");
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void testSumOfLines() {
    //     ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(15, 140, -125));
    //     ArrayList<Integer> actual = ProblemSet0.sumOfLines("data/sum_of_lines.csv");
    //     assertEquals(expected, actual);

    //     expected = new ArrayList<>(Arrays.asList(0, 1, 2, 12, -2, 18, 4, 91, 60));
    //     actual = ProblemSet0.sumOfLines("data/sum_of_lines2.csv");
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void testSumOfLinesNoFile() {
    //     ArrayList<Integer> expected = new ArrayList<>();
    //     ArrayList<Integer> actual = ProblemSet0.sumOfLines("file_does_not_existwahvdoiahvwdha");
    //     assertEquals(expected, actual);
    // }

}

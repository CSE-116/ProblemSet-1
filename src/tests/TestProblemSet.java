package tests;
import org.junit.Test;

import problem.ProblemSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestProblemSet {

    private final double EPSILON = 0.001;

    @Test
    public void testCheckSign1() {
        assertEquals("positive", ProblemSet.checkSign(1));
        assertEquals("positive", ProblemSet.checkSign(2));
        assertEquals("positive", ProblemSet.checkSign(5));
        assertEquals("positive", ProblemSet.checkSign(10));
        assertEquals("positive", ProblemSet.checkSign(132));

        assertEquals("zero", ProblemSet.checkSign(0));

        assertEquals("negative", ProblemSet.checkSign(-1));
        assertEquals("negative", ProblemSet.checkSign(-7));
        assertEquals("negative", ProblemSet.checkSign(-25));
        assertEquals("negative", ProblemSet.checkSign(-363));
    }

    @Test
    public void testGreatestNumber1() {
        assertEquals(5.0, ProblemSet.greatestNumber(1.0, 3.0, 5.0), EPSILON);
        assertEquals(5.0, ProblemSet.greatestNumber(5.0, 3.0, 1.0), EPSILON);
        assertEquals(5.0, ProblemSet.greatestNumber(3.0, 5.0, 1.0), EPSILON);

        assertEquals(5.0, ProblemSet.greatestNumber(1.0, -3.0, 5.0), EPSILON);
        assertEquals(3.0, ProblemSet.greatestNumber(1.0, 3.0, -5.0), EPSILON);

        assertEquals(0.0, ProblemSet.greatestNumber(-1.0, -12.0, 0.0), EPSILON);
        assertEquals(-1.0, ProblemSet.greatestNumber(-1.0, -12.0, -8.0), EPSILON);
    }

    @Test
    public void testGreatestNumber2() {
        assertEquals(0.0, ProblemSet.greatestNumber(0.0, 0.0, 0.0), EPSILON);
        assertEquals(3.0, ProblemSet.greatestNumber(-124.0, 3.0, -1.0), EPSILON);
        assertEquals(-8.0, ProblemSet.greatestNumber(-8.0, -8.0, -8.0), EPSILON);
        assertEquals(-2.0, ProblemSet.greatestNumber(-8.0, -6.0, -2.0), EPSILON);
    }

    @Test
    public void testLongestStringIndex() {
        ArrayList<String> list = new ArrayList<>();
        assertEquals(-1, ProblemSet.longestStringIndex(list));

        list.add("1");
        assertEquals(0, ProblemSet.longestStringIndex(list));

        list.add("4444");
        list.add("22");
        list.add("333");
        assertEquals(1, ProblemSet.longestStringIndex(list));

        list.add("666666");
        assertEquals(4, ProblemSet.longestStringIndex(list));
    }

    @Test
    public void testAverage() {
        HashMap<ArrayList<Double>, Double> testCases = new HashMap<>();

        testCases.put(new ArrayList<>(Arrays.asList(1.1, 2.0, 3.9)), 2.33333333333);
        testCases.put(new ArrayList<>(Arrays.asList(1.0)), 1.0);
        testCases.put(new ArrayList<>(Arrays.asList(-1.0, 0.0, 1.0)), 0.0);
        testCases.put(new ArrayList<>(Arrays.asList(0.0)), 0.0);
        testCases.put(new ArrayList<>(Arrays.asList(-10.0, 5.5, 1.5, 2.3)), -0.175);
        testCases.put(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0)), 2.0);
        testCases.put(new ArrayList<>(Arrays.asList(-9.9)), -9.9);

        for (ArrayList<Double> input : testCases.keySet()) {
            double expected = testCases.get(input);
            double computed = ProblemSet.average(input);
            assertEquals(computed, expected, EPSILON);
        }
    }

    @Test
    public void testFirstNInts() {
        HashMap<Integer, ArrayList<Integer>> testCases = new HashMap<>();
        testCases.put(0, new ArrayList<>());
        testCases.put(1, new ArrayList<>(Arrays.asList(1)));
        testCases.put(2, new ArrayList<>(Arrays.asList(1, 2)));
        testCases.put(5, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        testCases.put(9, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        testCases.put(-1, new ArrayList<>());
        testCases.put(-2, new ArrayList<>());
        testCases.put(-10, new ArrayList<>());
        testCases.put(-1162, new ArrayList<>());

        for (int input : testCases.keySet()) {
            ArrayList<Integer> expected = testCases.get(input);
            ArrayList<Integer> actual = ProblemSet.firstNInts(input);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testSumOfDigits1() {
        int returned = ProblemSet.sumOfDigits(123);
        int expected = 6;
        assertEquals(returned + " did not equal " + expected, expected, returned);
    }

    @Test
    public void testSumOfDigits2() {
        HashMap<Integer, Integer> testCases = new HashMap<>();
        testCases.put(1, 1);
        testCases.put(0, 0);
        testCases.put(586, 19);
        testCases.put(1234567890, 45);
        testCases.put(-1234567890, 45);
        for (int input : testCases.keySet()) {
            int expected = testCases.get(input);
            int returned = ProblemSet.sumOfDigits(input);
            assertTrue(returned + " did not equal " + expected, expected == returned);
        }
    }

    @Test
    public void testBestKey1() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 1);
        input.put("b", 2);
        input.put("c", 3);
        input.put("d", 4);
        input.put("e", 5);
        String expected = "e";
        String computed = ProblemSet.bestKey(input);
        assertTrue(computed.equals(expected));
    }

    @Test
    public void testBestKey2() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 1);
        String expected = "a";
        String computed = ProblemSet.bestKey(input);
        assertTrue(computed.equals(expected));
    }

    @Test
    public void testBestKey3() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", -3);
        input.put("b", -2);
        input.put("c", -3);
        input.put("d", -4);
        input.put("e", -5);
        String expected = "b";
        String computed = ProblemSet.bestKey(input);
        assertTrue(computed.equals(expected));
    }

    @Test
    public void testBestKeyMultipleBest() {
        HashMap<String, Integer> input = new HashMap<>();
        input.put("a", 1);
        input.put("b", 6);
        input.put("c", 3);
        input.put("d", 6);
        input.put("e", 5);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("b", "d"));
        String computed = ProblemSet.bestKey(input);
        assertTrue(expected.contains(computed));
    }

    public static void compareHashMaps(HashMap<Integer, Integer> map1, HashMap<Integer, Integer> map2) {
        assertEquals(map1.size(), map2.size());
        for (int key : map1.keySet()) {
            assertTrue(map2.containsKey(key));
            assertEquals(map1.get(key), map2.get(key));
        }
    }

    @Test
    public void testSquareNumbersEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        HashMap<Integer, Integer> actual = ProblemSet.squareNumbers(input);
        assertTrue(actual.isEmpty());
        assertTrue(actual.size() == 0); // This does the same thing as the line above
    }

    @Test
    public void testSquareNumbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 5, 6));
        HashMap<Integer, Integer> actual = ProblemSet.squareNumbers(input);
        HashMap<Integer,Integer> expected = new HashMap<>(Map.of(1, 1, 5, 25, 6, 36));
        compareHashMaps(actual, expected);
    }

    @Test
    public void testSquareNumbersLongList() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 5, 6, 4, 14, 3, 9, 12));
        HashMap<Integer, Integer> actual = ProblemSet.squareNumbers(input);
        HashMap<Integer,Integer> expected = new HashMap<>(Map.of(1, 1, 5, 25, 6, 36, 4, 16, 14, 196, 3, 9, 9, 81, 12, 144));
        compareHashMaps(actual, expected);
    }

    @Test
    public void testSquareNumbersWithNegatives() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, -2, 0, -4, -8, 8));
        HashMap<Integer, Integer> actual = ProblemSet.squareNumbers(input);
        HashMap<Integer,Integer> expected = new HashMap<>(Map.of(1, 1, -2, 4, 0, 0, -4, 16, -8, 64, 8, 64));
        compareHashMaps(actual, expected);
    }

    @Test
    public void testCountOccurrences1() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 1, 4, 1, 8, -4, 0, 1, 1, 5, 4, 1));
        assertEquals(0, ProblemSet.countOccurrences(input, 155));
        assertEquals(0, ProblemSet.countOccurrences(input, 10));
        assertEquals(0, ProblemSet.countOccurrences(input, -2));
        assertEquals(2, ProblemSet.countOccurrences(input, 0));
        assertEquals(5, ProblemSet.countOccurrences(input, 1));
        assertEquals(2, ProblemSet.countOccurrences(input, 4));
        assertEquals(1, ProblemSet.countOccurrences(input, -4));
        assertEquals(1, ProblemSet.countOccurrences(input, 5));
    }

    @Test
    public void testCountOccurrencesWithEmptyArrayList() {
        ArrayList<Integer> input = new ArrayList<>();
        assertEquals(0, ProblemSet.countOccurrences(input, 155));
        assertEquals(0, ProblemSet.countOccurrences(input, 10));
        assertEquals(0, ProblemSet.countOccurrences(input, -2));
        assertEquals(0, ProblemSet.countOccurrences(input, 0));
        assertEquals(0, ProblemSet.countOccurrences(input, 1));
        assertEquals(0, ProblemSet.countOccurrences(input, 4));
        assertEquals(0, ProblemSet.countOccurrences(input, -4));
        assertEquals(0, ProblemSet.countOccurrences(input, 5));
    }

}

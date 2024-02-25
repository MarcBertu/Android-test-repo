package com.example.androidtestapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /*
        More precise Unit Test
     */

    @Test
    public void isTheListSize_equalToTheParameterValue() {
        final int NEEDED_SIZE = 10;

        List<Integer> integerList = UnitTestClass.functionToCreateAListOfIntegerXTimes(NEEDED_SIZE);

        assertEquals(NEEDED_SIZE,integerList.size());
    }

    @Test
    public void isTheListSize_notEqualToTheParameterValue() {
        final int NEEDED_SIZE = 10;

        List<Integer> integerList = UnitTestClass.functionToCreateAListOfIntegerXTimes2(NEEDED_SIZE);

        assertNotEquals(NEEDED_SIZE,integerList.size());
    }
}
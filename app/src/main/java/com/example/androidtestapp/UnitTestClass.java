package com.example.androidtestapp;

import java.util.ArrayList;
import java.util.List;

public class UnitTestClass {

    /**
     * What to test ?
     *
     * For example if the parameter "listSize" is equal to 10, the list size will be equal to :
     * - A) 10
     * - B) 9
     * - C) 11
     *
     * As you understand here we not test the fact that this function return a list of integer but if the loop "for" is written correctly
     * This method can be test with UnitTest
     */
    public static List<Integer> functionToCreateAListOfIntegerXTimes(int listSize) {
        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i < listSize; i++) {
            integerList.add(i);
        }

        return integerList;
    }

    /**
     * Same method as above but with the for condition modified
     */
    public static List<Integer> functionToCreateAListOfIntegerXTimes2(int listSize) {
        List<Integer> integerList = new ArrayList<>();

        // The '=' create a one step more than the above method
        for(int i = 0; i <= listSize; i++) {
            integerList.add(i);
        }

        return integerList;
    }
}

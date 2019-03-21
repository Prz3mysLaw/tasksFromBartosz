package pl.com.urestApp.maybeMyNewJob.sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class NumbersSortTest {

    @Test
    public void shouldReturnASCSortedArray() {
        //given
        ArrayList testList = new ArrayList(Arrays.asList(1,5,8,7,3));
        String orderType = "ASC";
        ArrayList expectedList = new ArrayList(Arrays.asList(1,3,5,7,8));
        //when
        NumbersSort numbersSort = new NumbersSort();
        //then
        assertEquals(expectedList, numbersSort.timeToSort(testList, orderType));
    }

    @Test
    public void shouldReturnDESCSortedArray() {
        //given
        ArrayList testList = new ArrayList(Arrays.asList(1,5,8,7,3));
        String orderType = "DESC";
        ArrayList expectedList = new ArrayList(Arrays.asList(8,7,5,3,1));
        //when
        NumbersSort numbersSort = new NumbersSort();
        //then
        assertEquals(expectedList, numbersSort.timeToSort(testList, orderType));
    }

    @Test
    public void ahouldReturnEmptyArrayWhenDontSetOrder() {
        //given
        ArrayList testList = new ArrayList(Arrays.asList(1, 2, 8, 7, 3));
        String typeSort = "";
        ArrayList emptyList = new ArrayList(Arrays.asList());

        //when
        NumbersSort numbersSort = new NumbersSort();

        //then
        assertEquals(emptyList, numbersSort.timeToSort(testList, typeSort));
    }

    @Test
    public void ahouldReturnEmptyArrayWhenOrderIsNull() {
        //given
        ArrayList testList = new ArrayList(Arrays.asList(1, 2, 8, 7, 3));
        String typeSort = null;
        ArrayList emptyList = new ArrayList(Arrays.asList());

        //when
        NumbersSort numbersSort = new NumbersSort();

        //then
        assertEquals(emptyList, numbersSort.timeToSort(testList, typeSort));
    }

    @Test
    public void ahouldReturnEmptyArrayWhenArrayIsNull() {
        //given
        ArrayList testList = null;
        String typeSort = "ASC";
        ArrayList emptyList = new ArrayList(Arrays.asList());

        //when
        NumbersSort numbersSort = new NumbersSort();

        //then
        assertEquals(emptyList, numbersSort.timeToSort(testList, typeSort));
    }

    @Test
    public void ahouldReturnEmptyArrayWhenAnyElementIsNull() {
        //given
        ArrayList testList = new ArrayList(Arrays.asList(1, 2, 8, null, 3));
        String typeSort = null;
        ArrayList emptyList = new ArrayList(Arrays.asList());

        //when
        NumbersSort numbersSort = new NumbersSort();

        //then
        assertEquals(emptyList, numbersSort.timeToSort(testList, typeSort));
    }



}
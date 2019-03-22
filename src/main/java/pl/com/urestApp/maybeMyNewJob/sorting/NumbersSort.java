package pl.com.urestApp.maybeMyNewJob.sorting;

import lombok.Data;
import lombok.Getter;
import lombok.Value;

import java.util.ArrayList;
import java.util.Collections;


@Data
public class NumbersSort {

    ArrayList<Long> numbers = new ArrayList();
    String order;


    public ArrayList timeToSort(ArrayList nl, String orderType) throws NullPointerException {
        ArrayList empty = new ArrayList();
        try {

        if(orderType == null || nl == null) return empty;

        if(orderType.toUpperCase().trim().contains("ASC") && orderType.trim().length() == 3) {
            Collections.sort(nl);
            return nl;
        }

        if(orderType.toUpperCase().trim().contains("DESC") && orderType.trim().length() == 4) {
            Collections.sort(nl, Collections.reverseOrder());
            return nl;
        } } catch (NullPointerException e) {}

        return empty;
    }

}
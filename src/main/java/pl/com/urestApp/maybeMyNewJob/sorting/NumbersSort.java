package pl.com.urestApp.maybeMyNewJob.sorting;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;

@Data
public class NumbersSort {

    ArrayList<Long> numbersList = new ArrayList();
    String sortType;


    public ArrayList timeToSort(ArrayList nl, String orderType) {

        ArrayList empty = new ArrayList();
        if(orderType == null || nl == null) return empty;

        if(orderType.toUpperCase().trim().contains("ASC") && orderType.trim().length() == 3) {
            Collections.sort(nl);
            return nl;
        }

        if(orderType.toUpperCase().trim().contains("DESC") && orderType.trim().length() == 4) {
            Collections.sort(nl, Collections.reverseOrder());
            return nl;
        }

        return empty;
    }

}
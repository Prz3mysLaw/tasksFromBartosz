package pl.com.urestApp.maybeMyNewJob.sorting;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class SortController {

    @RequestMapping(value = "/numbers/sort-command", method = RequestMethod.POST)
    public ResponseEntity<SortedNumbers> getNumbersAndTypeSort(@RequestBody NumbersSort numbersSort) {

        ArrayList emptyList = new ArrayList(Arrays.asList());
        ArrayList numbers = numbersSort.timeToSort(numbersSort.getNumbers(), numbersSort.getOrder());
        SortedNumbers answer = new SortedNumbers(numbers.toString());
        if (numbers.size()==0) {
            return new ResponseEntity("BAD_REQUEST", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity(answer,HttpStatus.OK);
        }

    }

}

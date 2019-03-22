package pl.com.urestApp.maybeMyNewJob.maybeKantor;


import lombok.Data;

import java.util.ArrayList;

@Data
public class FindResponseBody {
    String currency;
    List<Rate> rates = new ArrayList<Rate>();
}

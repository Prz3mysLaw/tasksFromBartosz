package pl.com.urestApp.maybeMyNewJob.maybeKantor;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FindResponseBody {
    String currency;
    List<Rate> rates = new ArrayList<Rate>();
}

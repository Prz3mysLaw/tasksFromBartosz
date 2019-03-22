package pl.com.urestApp.maybeMyNewJob.maybeKantor;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ChechCurrencyValueController {

    FindCurrencyValueService findCurrencyValueService;

    @RequestMapping(value = "/currencies/get-current-currency-value-command", method = RequestMethod.POST )
    public ResponseEntity getValue(@RequestBody InputCurrencyCode input) {

        String response = findCurrencyValueService.findValue(input.getCurrency());
        if (response == "404") {
            return new ResponseEntity("404 NotFound", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity(new OutputCurrencyValue(response), HttpStatus.OK );
        }

    }



}

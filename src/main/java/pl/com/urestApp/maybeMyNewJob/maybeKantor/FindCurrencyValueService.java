package pl.com.urestApp.maybeMyNewJob.maybeKantor;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
public class FindCurrencyValueService {

    private String nbpApiUri;

    private RestTemplate restTemplate;

    public String findValue(String currencyCode) throws HttpClientErrorException {

        try {
            ResponseEntity<FindResponseBody> responseEntity =
                    restTemplate.getForEntity(nbpApiUri + currencyCode, FindResponseBody.class);
            Double out = responseEntity.getBody().getRates().get(0).getMid();
            return String.valueOf(out);
        } catch (HttpClientErrorException e) {
         
        return "404";
        }
    }

}

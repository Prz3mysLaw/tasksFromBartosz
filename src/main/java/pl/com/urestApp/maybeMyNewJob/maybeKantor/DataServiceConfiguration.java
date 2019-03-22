package pl.com.urestApp.maybeMyNewJob.maybeKantor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DataServiceConfiguration {

    @Value("http://api.nbp.pl/api/exchangerates/rates/a/")
    String nbpApiUrl;

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    FindCurrencyValueService findCurrencyValueService(RestTemplate restTemplate){
        return new FindCurrencyValueService(nbpApiUrl, restTemplate);
    }

}

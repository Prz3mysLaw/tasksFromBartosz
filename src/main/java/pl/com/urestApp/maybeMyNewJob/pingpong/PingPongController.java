package pl.com.urestApp.maybeMyNewJob.pingpong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    @RequestMapping("/status/pobg")
    public String pingAnswer() {
        return  new PingPong().getAnswer();
    }
}

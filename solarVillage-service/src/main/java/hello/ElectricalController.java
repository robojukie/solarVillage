package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectricalController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/electrical", method=RequestMethod.GET)
    public Greeting getElectrical(@RequestParam(value="name", defaultValue="Approved") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
}

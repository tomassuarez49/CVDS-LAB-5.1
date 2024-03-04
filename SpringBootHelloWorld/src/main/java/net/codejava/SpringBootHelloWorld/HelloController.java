package net.codejava.SpringBootHelloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "http://localhost:3000/", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("/api/hello")
    public String hello() {
        return "¡Hola, Mundo!";
    }
}
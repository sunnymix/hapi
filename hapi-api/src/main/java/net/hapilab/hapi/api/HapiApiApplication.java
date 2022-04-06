package net.hapilab.hapi.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HapiApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HapiApiApplication.class, args);
    }

    @RestController
    public static class DefaultController {
        @GetMapping("")
        public String index() {
            return "hapi-api";
        }
    }

}

package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cetrin Wang on 2017/2/21.
 */
@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String sayHello() {
        return "Hello World!start your fist Spring Boot application!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

package cn.wolfcode._01_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloWorldController {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class);
    }
}

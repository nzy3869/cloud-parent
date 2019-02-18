package top.happybull.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.happybull.springcloud.ribbon.service.HelloService;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "nzy") String name) {
        return helloService.hiService(name);
    }

}

package com.dz.NewSpringPrj.controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println(" I'm in the controller");
        return "Hello Everyone";
    }
}

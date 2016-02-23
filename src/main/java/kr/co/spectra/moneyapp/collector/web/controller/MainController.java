package kr.co.spectra.moneyapp.collector.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class MainController {
 
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    
    @RequestMapping("/hello")
    public @ResponseBody String hello() {
    	return "Hello MoneyApp";
    }
}

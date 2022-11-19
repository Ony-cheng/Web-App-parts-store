package ony.store.controllers;

import ony.store.mustdie.Message;
import ony.store.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

//    @Autowired
//    TestService testService;



    @GetMapping(path="/test", params = {"query"})
    public Message test(@RequestParam final String query){
        Message message = new Message();

        System.out.println("Query received " + query);

        message.setMessage(query);
        return message;
    }

}

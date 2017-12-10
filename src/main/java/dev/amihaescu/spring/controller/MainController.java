package dev.amihaescu.spring.controller;

import dev.amihaescu.spring.dto.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andrei on 12/10/17.
 */

@RestController
@RequestMapping("/endpoint")
public class MainController {

    @RequestMapping(path = "/{name}")
    public Message getMessage(@PathVariable("name") String name){
        Message message = new Message();
        message.setId(3L);
        message.setText(name);
        return message;
    }
}

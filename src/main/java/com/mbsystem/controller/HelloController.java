package com.mbsystem.controller;

import com.mbsystem.domain.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by basilkiwanuka on 4/9/17.
 */

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @RequestMapping(value = "/basil", method = RequestMethod.GET, produces = "application/json")
    public Hello sayHello()
    {
        return new Hello("Hello Basil add to GetKraken");
    }
}

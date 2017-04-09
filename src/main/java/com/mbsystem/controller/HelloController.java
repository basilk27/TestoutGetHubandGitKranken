package com.mbsystem.controller;

import com.mbsystem.domain.BranchMessage;
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
        BranchMessage branchMessage = new BranchMessage();

        branchMessage.setMessage("ZMessage");

        String msg = "Hello Basil add to GetKraken " + branchMessage.getMessage();

        return new Hello(msg);
    }
}

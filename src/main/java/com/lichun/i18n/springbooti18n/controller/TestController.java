package com.lichun.i18n.springbooti18n.controller;

import com.lichun.i18n.springbooti18n.util.MessageUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return MessageUtils.get("user.welcome");
    }
}

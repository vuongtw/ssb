package io.github.vuongtw.ssb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.vuongtw.ssb.ContentOnlyMessage;

@RestController
public class HomeController {

    @GetMapping("/")
    public ContentOnlyMessage root() {
        return new ContentOnlyMessage("Ok");
    }
}

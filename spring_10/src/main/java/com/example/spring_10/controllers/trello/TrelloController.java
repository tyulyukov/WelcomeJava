package com.example.spring_10.controllers.trello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrelloController {
    public TrelloController() {

    }

    @GetMapping("/trello")
    public String index() {
        return "trello/index";
    }
}

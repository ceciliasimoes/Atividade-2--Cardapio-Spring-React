package br.com.ceciliasimoes.CardapioWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String redirect() {
        return "forward:/index.html";
    }
}

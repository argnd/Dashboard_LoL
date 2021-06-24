package com.hello.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    @GetMapping("/manage-team")
    public String getDashBoard() {
        return "layouts/manageteam/teamhome";
    }
}
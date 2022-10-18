package com.example.cvpage.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hire-me")
@RequiredArgsConstructor
public class hireMeController {
    @GetMapping
    public String getProjectPageMapping(Model model) {
        return "hire-me";
    }
}

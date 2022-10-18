package com.example.cvpage.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")
@RequiredArgsConstructor
public class cvController {
    @GetMapping
    public String getIndexMapping(Model model) {
        return "cv";
    }
}

package com.example.cvpage.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
@RequiredArgsConstructor
public class projectsController {
    @GetMapping
    public String getProjectPageMapping(Model model) {
        return "projects-grid-cards";
    }
}

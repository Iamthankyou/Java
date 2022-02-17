
package com.duy.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForexController {
    @GetMapping("/forexController")
    public String forex(@RequestParam float usd, Model model){
        float vnd = usd * 1;
        model.addAttribute("vnd",vnd);
        return "result";
    }
}

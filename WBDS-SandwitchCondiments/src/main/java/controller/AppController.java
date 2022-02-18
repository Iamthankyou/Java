package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/save")
    public ModelAndView saveCodiments(@RequestParam("condiment") String[] condiment){
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("condiments",condiment);
        return modelAndView;
    }
}

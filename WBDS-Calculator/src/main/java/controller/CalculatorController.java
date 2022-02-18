package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/index")
    ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @GetMapping("/calculator")
    ModelAndView calculator(@RequestParam(name = "opr_1") float opr1,
                            @RequestParam(name = "opr_2") float opr2,
                            @RequestParam(name = "operator") String operator){
        ModelAndView modelAndView = new ModelAndView("index");
        float result = 0;
        String message = "Success";
        switch (operator){
            case "add":
                result = opr1 + opr2;
                break;
            case "sub":
                result = opr1 - opr2;
                break;
            case "mul":
                result = opr1 * opr2;
                break;
            case "div":
                if (opr2 == 0){
                    message = "Can not division to zero";
                }else
                result = opr1 / opr2;
                break;
            default:
        }

        modelAndView.addObject("result",result);
        modelAndView.addObject("message",message);

        return modelAndView;
    }
}

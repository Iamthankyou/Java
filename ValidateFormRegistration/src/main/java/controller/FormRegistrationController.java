package controller;

import model.FormRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormRegistrationController {
    @GetMapping("/registration")
    ModelAndView getRegistrationForm() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("registration", new FormRegistration());
        return modelAndView;
    }

    @PostMapping("/registration")
    ModelAndView validateRegistration(@Validated @ModelAttribute ("registration")FormRegistration registration, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("result");
            return modelAndView;
        }
    }
}

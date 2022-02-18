package controller;

import model.EmailBox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.EmailBoxService;

import java.util.List;

@Controller
@RequestMapping("/email")
public class EmailController {
    @ModelAttribute("languages")
    public String[] getLanguages(){
        String[] languages={"English", "Vietnamese", "Japanese", "Chinese"};
        return languages;
    }

    @ModelAttribute("pageSize")
    public String[] getPageSize(){
        String[] pageSize= {"5", "10", "15", "20","100"};
        return pageSize;
    }

    EmailBoxService emailBoxService=new EmailBoxService();

    @GetMapping("")
    public ModelAndView showAll(){
        List<EmailBox> list=emailBoxService.findAll();
        return new ModelAndView("email","list",list);
    }

    @GetMapping("edit")
    public ModelAndView showFormEdit(@RequestParam int id){
        EmailBox emailBox=emailBoxService.findById(id);
        return new ModelAndView("edit","e",emailBox);
    }
    @PostMapping("edit")
    public ModelAndView edit(@RequestParam int id, @ModelAttribute EmailBox e){
        e.setId(id);
        emailBoxService.update(e);
        return new ModelAndView("redirect:/email");
    }
}

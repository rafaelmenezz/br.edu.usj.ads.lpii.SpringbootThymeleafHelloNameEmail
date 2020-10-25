package br.edu.usj.ads.lpii.hello_name_email.hellonameemail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class form {
    @PostMapping(value="/form")
    public ModelAndView postHelloNameEmail(@RequestParam String nome, @RequestParam String email) {

        ModelAndView modelAndView = new ModelAndView("formulario");
        modelAndView.addObject("nome", nome);
        modelAndView.addObject("email", email);
        return modelAndView;
    }
}

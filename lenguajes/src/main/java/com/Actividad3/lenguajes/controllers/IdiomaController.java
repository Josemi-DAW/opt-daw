package com.Actividad3.lenguajes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IdiomaController {

    @GetMapping("/lenguaje")
    public String lenguaje(@RequestParam(name = "idioma", required = false) String leng){
        if (leng == null || leng.isEmpty()) {
            return "redirect:/english.html";
        }

        if (leng.equalsIgnoreCase("spanish")){
            return "redirect:/spanish.html";
        } else if (leng.equalsIgnoreCase("english")){
            return "redirect:/english.html";
        } else if (leng.equalsIgnoreCase("german")){
            return "redirect:/german.html";
        } else if (leng.equalsIgnoreCase("french")){
            return "redirect:/french.html";
        }else{
            return "redirect:/english.html";
        }
    }
}

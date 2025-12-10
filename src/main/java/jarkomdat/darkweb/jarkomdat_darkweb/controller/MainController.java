package jarkomdat.darkweb.jarkomdat_darkweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Dark Web Jarkomdat");
        model.addAttribute("message", "Welcome to the Dark Web Jarkomdat!");
        return "index";
    }
}
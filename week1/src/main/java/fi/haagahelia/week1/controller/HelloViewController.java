package fi.haagahelia.week1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloViewController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name,
                        @RequestParam int age,
                        Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", Math.max(age, 0));
        return "hello";
    }
}

package fi.haagahelia.week1.controller;

import fi.haagahelia.week1.service.PageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    private final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping({"/", "/index"})
    public String index() {
        return pageService.getMainMessage();
    }

    @GetMapping("/contact")
    public String contact() {
        return pageService.getContactMessage();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String location,
                        @RequestParam String name) {
        return pageService.getWelcomMessage(location, name);
    }
}


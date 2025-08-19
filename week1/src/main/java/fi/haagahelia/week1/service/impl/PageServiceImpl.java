package fi.haagahelia.week1.service.impl;

import org.springframework.stereotype.Service;

import fi.haagahelia.week1.service.PageService;

@Service
public class PageServiceImpl implements PageService {

    @Override
    public String getMainMessage() {
        return "This is the main page";
    }

    @Override
    public String getContactMessage() {
        return "This is the contact page";
    }
    
}

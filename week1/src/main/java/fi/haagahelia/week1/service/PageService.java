package fi.haagahelia.week1.service;

public interface PageService {
    String getMainMessage();
    String getContactMessage();
    String getWelcomMessage(String location, String name);
}

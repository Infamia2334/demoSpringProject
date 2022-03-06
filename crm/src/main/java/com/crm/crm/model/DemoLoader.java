package com.crm.crm.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner  {

    private final ContactRepository repository; 

    @Autowired
    public DemoLoader(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Calling the Contact Constructor in Contact.java
        this.repository.save(new Contact("Infamia", "2334", "infamous@gmail.com", "+918420192886"));
        
    }
        
}
 
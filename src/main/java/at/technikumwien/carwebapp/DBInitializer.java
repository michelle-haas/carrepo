package at.technikumwien.carwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.event.EventListener;


import java.util.List;

@Configuration
public class DBInitializer {

    @Autowired
    private CarRepository repo;

    @EventListener(ApplicationReadyEvent.class)
    public void handleApplicationEvent(){
        repo.saveAll(
                List.of(
                        new Car(
                                null,
                                "Audi",
                                "My Car 1",
                                "2009"
                        ),
                        new Car(
                                null,
                                "Bmw",
                                "My Car 2",
                                "2004"
                        )
                )
        );
    }
}
package at.technikumwien.carwebapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources/cars")
public class CarResource {

    @Autowired
    private CarRepository repo;

    @GetMapping
    public List<Car> retrieveAll() {

        return repo.findAll();
    }
}

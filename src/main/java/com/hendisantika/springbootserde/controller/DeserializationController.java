package com.hendisantika.springbootserde.controller;

import com.hendisantika.springbootserde.model.Animal;
import com.hendisantika.springbootserde.service.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-serde
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-16
 * Time: 06:09
 */
@RestController
@RequestMapping("/deserializeAnimal")
public class DeserializationController {

    private AnimalService animalService;

    public DeserializationController(AnimalService animalService) {
        super();
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAnimals() throws Exception {
        return animalService.getAnimals();
    }
}
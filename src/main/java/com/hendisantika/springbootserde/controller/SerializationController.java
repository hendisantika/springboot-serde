package com.hendisantika.springbootserde.controller;

import com.hendisantika.springbootserde.model.Animal;
import com.hendisantika.springbootserde.service.AnimalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-serde
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-16
 * Time: 06:08
 */
@RestController
@RequestMapping("/serializeAnimal")
public class SerializationController {

    private AnimalService animalService;

    public SerializationController(AnimalService animalService) {
        super();
        this.animalService = animalService;
    }

    @PostMapping
    public String post(@RequestBody final Animal animal) throws Exception {
        animalService.save(animal);

        return "animal is saved!";
    }

}
package com.hendisantika.springbootserde.service;

import com.hendisantika.springbootserde.model.Animal;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-serde
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-16
 * Time: 06:04
 */
public interface AnimalService {
    void save(Animal animal) throws Exception;

    List<Animal> getAnimals() throws Exception;
}

package com.hendisantika.springbootserde.repository;

import com.hendisantika.springbootserde.model.SerializedAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-serde
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-16
 * Time: 06:04
 */
public interface SerializedAnimalRepo extends JpaRepository<SerializedAnimal, Integer> {

}
package com.hendisantika.springbootserde.service;

import com.hendisantika.springbootserde.model.Animal;
import com.hendisantika.springbootserde.model.SerializedAnimal;
import com.hendisantika.springbootserde.repository.SerializedAnimalRepo;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-serde
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-16
 * Time: 06:06
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    private SerializedAnimalRepo serializedAnimalRepo;

    public AnimalServiceImpl(SerializedAnimalRepo serializedAnimalRepo) {
        super();
        this.serializedAnimalRepo = serializedAnimalRepo;
    }

    public void save(Animal animal) throws Exception {

        byte[] serializedAnimalByteArr = serialize(animal);

        SerializedAnimal serializedAnimal = new SerializedAnimal(serializedAnimalByteArr);

        this.serializedAnimalRepo.save(serializedAnimal);

    }

    private byte[] serialize(Animal animal) throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        try {

            objectOutputStream.writeObject(animal);

            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }

        return null;
    }
}

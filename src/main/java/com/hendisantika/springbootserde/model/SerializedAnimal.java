package com.hendisantika.springbootserde.model;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-serde
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-16
 * Time: 06:03
 */
@Entity
@Table
public class SerializedAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private byte[] serializedAnimal;

    public SerializedAnimal(byte[] serializedAnimal) {
        super();

        this.serializedAnimal = serializedAnimal;
    }

    public SerializedAnimal() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getSerializedAnimal() {
        return serializedAnimal;
    }

    public void setSerializedAnimal(byte[] serializedAnimal) {
        this.serializedAnimal = serializedAnimal;
    }

}
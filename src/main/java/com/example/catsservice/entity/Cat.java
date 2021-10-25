package com.example.catsservice.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = false)
public class Cat {

    @Id
    String id;
    String name;
    LocalDate birthDay;
    LocalDateTime createdAt;
}
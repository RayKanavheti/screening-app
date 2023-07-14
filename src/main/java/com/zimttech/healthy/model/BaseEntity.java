package com.zimttech.healthy.model;


import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false, updatable = false)
    private long id;
}

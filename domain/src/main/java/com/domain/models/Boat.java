package com.domain.models;

import lombok.Getter;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "boat")
public class Boat extends ResourceSupport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Getter
    private String name;
    @Getter
    private String harbor;
    @Getter
    private String brand;
    @Getter
    private Integer ft;

    public Boat() {
    }


    public Boat(String name, String harbor, String brand, Integer ft) {
        this.name = name;
        this.harbor = harbor;
        this.brand = brand;
        this.ft = ft;
    }

}

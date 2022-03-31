package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "writers")
@Getter
@Setter
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

//    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
//    @JsonManagedReference


    @JsonIgnoreProperties(value = {"writer", "hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "writer", cascade = CascadeType.ALL)
    private Set<Comic> comics = new LinkedHashSet<>();

}
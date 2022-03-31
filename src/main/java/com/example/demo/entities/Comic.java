package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comics")
@Getter
@Setter
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number", nullable = false)
    private Integer number;

    @Column(name = "link")
    private String link;

    @Column(name = "enlace")
    private String enlace;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "event")
//    @JsonBackReference

    @JsonIgnoreProperties(value = {"comics", "hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    private Event event;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "writer")
//    @JsonBackReference

    @JsonIgnoreProperties(value = {"comics", "hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    private Writer writer;

    @Column(name = "name", nullable = false)
    private String name;

}
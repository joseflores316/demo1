package com.example.demo.repositories;

import com.example.demo.entities.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComicRepository extends JpaRepository<Comic, Long> {
    List<Comic> findAll();
}
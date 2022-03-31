package com.example.demo.controllers;

import com.example.demo.entities.Comic;
import com.example.demo.services.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComicController {

    @Autowired
    public ComicService comicService;


    @GetMapping("/comics")
    public List<Comic> getAll() {
        return comicService.findAll();
    }

}

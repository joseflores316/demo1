package com.example.demo.services.impl;

import com.example.demo.entities.Comic;
import com.example.demo.repositories.ComicRepository;
import com.example.demo.services.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicServiceImpl implements ComicService {

    @Autowired
    ComicRepository comicRepository;

    @Override
    public List<Comic> findAll() {
        return comicRepository.findAll();
    }
}

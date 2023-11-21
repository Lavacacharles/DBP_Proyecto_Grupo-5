package com.example.demo.application;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.entities.Comic;
import com.example.demo.domain.services.comicService;


@RestController
@CrossOrigin
@RequestMapping("/Comics")
public class ComicController {
    @Autowired
    private comicService comicservice;


    @Secured({"ADMIN", "USER"})
    @GetMapping
    public List<Comic> obtenerTodosLosComics() {
        return comicservice.obtenerTodosLosComics();
    }


}

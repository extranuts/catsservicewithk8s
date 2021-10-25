package com.example.catsservice.controller;

import com.example.catsservice.dto.CatDto;
import com.example.catsservice.entity.Cat;
import com.example.catsservice.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cats")
public class CatController {

    private final CatService service;

    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return service.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return service.getAll();
    }
}

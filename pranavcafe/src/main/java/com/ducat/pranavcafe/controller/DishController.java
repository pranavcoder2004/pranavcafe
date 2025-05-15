package com.ducat.pranavcafe.controller;

import com.ducat.pranavcafe.dto.DishInputDto;
import com.ducat.pranavcafe.dto.DishOutputDto;
import com.ducat.pranavcafe.model.emuns.Category;
import com.ducat.pranavcafe.service.DishImptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dish")

public class DishController {
    @Autowired
    DishImptService dishImptService;
    @PostMapping
    public ResponseEntity<String>dishAdd(@RequestBody DishInputDto dto){
        return new ResponseEntity<>(dishImptService.addDish(dto), HttpStatusCode.valueOf(200));

    }
    @GetMapping("/{id}")
    public ResponseEntity<DishOutputDto>dishGet(@PathVariable Long id){
        return new ResponseEntity<>(dishImptService.getDish(id),HttpStatusCode.valueOf(200));
    }
    @GetMapping("/category")
     public ResponseEntity<List<DishOutputDto>> findcat(@RequestParam Category cat){
        return new ResponseEntity<>(dishImptService.searchByName(cat),HttpStatusCode.valueOf(200));
    }
}

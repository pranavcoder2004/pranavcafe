package com.ducat.pranavcafe.controller;

import com.ducat.pranavcafe.dto.DishInputDto;
import com.ducat.pranavcafe.dto.DishOutputDto;
import com.ducat.pranavcafe.service.DishImptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Dish")

public class DishController {
    @Autowired
    DishImptService dishImptService;
    @PostMapping
    ResponseEntity<String>dishAdd(@RequestBody DishInputDto dto){
        return new ResponseEntity<>(dishImptService.addDish(dto), HttpStatusCode.valueOf(200));

    }
    @GetMapping("/{id}")
    ResponseEntity<DishOutputDto>dishGet(@PathVariable Long id){
        return new ResponseEntity<>(dishImptService.getDish(id),HttpStatusCode.valueOf(200));
    }
}

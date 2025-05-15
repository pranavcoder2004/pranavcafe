package com.ducat.pranavcafe.service;

import com.ducat.pranavcafe.dto.DishInputDto;
import com.ducat.pranavcafe.dto.DishOutputDto;
import com.ducat.pranavcafe.model.Dish;
import com.ducat.pranavcafe.model.emuns.Category;

import java.util.List;

public interface CafeService {
    String addDish(DishInputDto dish);
    DishOutputDto getDish(Long id);
    List<DishOutputDto> searchByName(Category name);


}

package com.ducat.pranavcafe.service;

import com.ducat.pranavcafe.dto.DishInputDto;
import com.ducat.pranavcafe.dto.DishOutputDto;

public interface CafeService {
    String addDish(DishInputDto dish);
    DishOutputDto getDish(Long id);


}

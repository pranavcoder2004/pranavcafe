package com.ducat.pranavcafe.dto;

import com.ducat.pranavcafe.model.emuns.Category;
import lombok.Data;

@Data
public class DishOutputDto {
    Long id;
    String name;
    Double price;
    Category category;
}

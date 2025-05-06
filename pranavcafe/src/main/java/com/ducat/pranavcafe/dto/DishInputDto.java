package com.ducat.pranavcafe.dto;

import com.ducat.pranavcafe.model.emuns.Category;
import lombok.Data;

@Data
public class DishInputDto {

    String name;
    Double price;
    Category category;
}

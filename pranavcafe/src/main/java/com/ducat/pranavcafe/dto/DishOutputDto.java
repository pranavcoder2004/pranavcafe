package com.ducat.pranavcafe.dto;

import com.ducat.pranavcafe.model.emuns.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DishOutputDto {
    Long id;
    String name;
    Double price;
    Category category;
}

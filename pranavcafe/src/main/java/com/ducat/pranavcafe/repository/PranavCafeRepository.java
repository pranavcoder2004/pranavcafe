package com.ducat.pranavcafe.repository;

import com.ducat.pranavcafe.model.Dish;
import com.ducat.pranavcafe.model.emuns.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PranavCafeRepository extends JpaRepository<Dish , Long> {

    List<Dish> findByCategory(Category name);
    Dish findByName (String name);
}

package com.ducat.pranavcafe.repository;

import com.ducat.pranavcafe.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PranavCafeRepository extends JpaRepository<Dish , Long> {
}

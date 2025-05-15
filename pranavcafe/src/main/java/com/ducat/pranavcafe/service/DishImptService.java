package com.ducat.pranavcafe.service;

import com.ducat.pranavcafe.dto.DishInputDto;
import com.ducat.pranavcafe.dto.DishOutputDto;
import com.ducat.pranavcafe.model.Customer;
import com.ducat.pranavcafe.model.Dish;
import com.ducat.pranavcafe.model.emuns.Category;
import com.ducat.pranavcafe.repository.CustomeRepository;
import com.ducat.pranavcafe.repository.PranavCafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishImptService implements CafeService{
    @Autowired
    CustomeRepository customeRepository;

    @Autowired
    PranavCafeRepository pranavcafeRepository;
    @Override
    public String addDish(DishInputDto dish) {
        Dish dish1 = new Dish();

        dish1.setName(dish.getName());
        dish1.setCategory(dish.getCategory());
        dish1.setPrice(dish.getPrice());



        dish1=pranavcafeRepository.save(dish1);


       return "dish added sussecfully "+ dish1.getId();


    }

    @Override
    public DishOutputDto getDish(Long id) {
        Dish dish = pranavcafeRepository.findById(id).orElse(null);
        DishOutputDto dt;
        dt = new DishOutputDto();
        dt.setPrice(dish.getPrice());
        dt.setId(dish.getId());
        dt.setName(dish.getName());
        dt.setCategory(dish.getCategory());
        return dt;



    }
    @Override
    public List<DishOutputDto>searchByName(Category name) {

        List<Dish> dish = pranavcafeRepository.findByCategory(name);
        List<DishOutputDto> r = new ArrayList<>();
        for (Dish dish1 : dish){
            DishOutputDto outdto = new DishOutputDto();
                    outdto.setId(dish1.getId());
                    outdto.setName(dish1.getName());
                    outdto.setCategory(dish1.getCategory());
                    outdto.setPrice(dish1.getPrice());

            r.add(outdto);


        }
        return r;
    }

}

package com.ducat.pranavcafe.service;

import com.ducat.pranavcafe.dto.CustomerInputDto;
import com.ducat.pranavcafe.dto.CustomerOutputDto;
import com.ducat.pranavcafe.model.Customer;
import com.ducat.pranavcafe.model.Dish;
import com.ducat.pranavcafe.model.emuns.OrderStatus;
import com.ducat.pranavcafe.repository.CustomeRepository;
import com.ducat.pranavcafe.repository.PranavCafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomeRepository customeRepository;
    @Autowired
    PranavCafeRepository pranavCafeRepository;


    @Override
    public CustomerOutputDto doOrder(CustomerInputDto customerInputDto) {
        Customer c1 = new Customer();
        Dish dish = new Dish();
        dish = pranavCafeRepository.findByName(customerInputDto.getItem());


        c1.setName(customerInputDto.getName());
        c1.setPaymentType(customerInputDto.getPaymentType());
        c1.setItem(customerInputDto.getItem());
        c1.setDish(dish);



        c1 = customeRepository.save(c1);


        return CustomerOutputDto.builder()
                .OrderId(c1.getId())
                .OrderBy(c1.getName())
                .paymentType(c1.getPaymentType())
                .bill(dish.getPrice())

                .build();






    }}



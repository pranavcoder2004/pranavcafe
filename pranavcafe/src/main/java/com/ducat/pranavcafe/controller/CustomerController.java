package com.ducat.pranavcafe.controller;

import com.ducat.pranavcafe.dto.CustomerInputDto;
import com.ducat.pranavcafe.dto.CustomerOutputDto;
import com.ducat.pranavcafe.model.Customer;
import com.ducat.pranavcafe.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")

public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping
    public ResponseEntity<CustomerOutputDto> order(@RequestBody CustomerInputDto customerInputDto){
        return new ResponseEntity<>(customerService.doOrder(customerInputDto), HttpStatusCode.valueOf(200));
    }
}

package com.ducat.pranavcafe.service;

import com.ducat.pranavcafe.dto.CustomerInputDto;
import com.ducat.pranavcafe.dto.CustomerOutputDto;

public interface CustomerService {
    CustomerOutputDto doOrder(CustomerInputDto customerInputDto);


}

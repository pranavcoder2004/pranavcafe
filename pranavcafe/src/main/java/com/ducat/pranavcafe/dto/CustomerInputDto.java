package com.ducat.pranavcafe.dto;

import com.ducat.pranavcafe.model.emuns.PaymentType;
import lombok.Data;

@Data
public class CustomerInputDto {
    public String Name;
    public String item;
    public PaymentType paymentType;

}

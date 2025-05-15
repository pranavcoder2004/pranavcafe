package com.ducat.pranavcafe.dto;

import com.ducat.pranavcafe.model.emuns.PaymentType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerOutputDto {
    public Long OrderId;
    public String OrderBy;
    public Double bill;
    public PaymentType paymentType;
}

package com.davor.msscbrewery.web.mappers;

import com.davor.msscbrewery.domain.Customer;
import com.davor.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
	CustomerDto customerToCustomerDto(Customer customer);

	Customer customerDtoToCustomer(CustomerDto customerDto);
}

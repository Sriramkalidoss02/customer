package com.customer.service;


import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer addAccount(Customer customer) {
      return customerRepository.save(customer);
    }

    public Page<Customer> getAccounts(int pageNumber, int pageSize, String sortColumn, String order) {
        return customerRepository.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(Sort.Direction.fromString(order.toUpperCase(Locale.ROOT)), sortColumn)));
    }
}

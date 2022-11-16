package com.customer.controller;

import com.customer.entity.Customer;
import com.customer.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping(value = "/v1/events/file")
    public ResponseEntity<Customer> createAccount(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.addAccount(customer), HttpStatus.CREATED);
    }

    @GetMapping("/v1/events/file")
    public ResponseEntity<Page<Customer>> getAccounts(@RequestParam(defaultValue = "0", required = false) int page,
                                                      @RequestParam(defaultValue = "100", required = false) int size,
                                                      @RequestParam(defaultValue = "customerId",required = false) String sort,
                                                      @RequestParam(defaultValue = "ASC",required = false) String order) {
        return new ResponseEntity<>(customerService.getAccounts(page, size, sort, order), HttpStatus.OK);
    }
}

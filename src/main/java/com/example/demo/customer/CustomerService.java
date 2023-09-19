package com.example.demo.customer;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;

@Service
public class CustomerService {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(
            CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        LOGGER.info("getCustomer was called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(
                        () -> {
                            NotFoundException notFoundException = new NotFoundException(
                                    "customer with id " + id + " not found");
                            LOGGER.error("error in getCustomer {}", id, notFoundException);
                            return notFoundException;
                        });

    }
}
package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

public class CustomerRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomer() {
        return Collections.singletonList(
                new Customer(1L, "TODO DB"));

    }

}

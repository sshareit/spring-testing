package org.dmace.demos.customer;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public DataTablesOutput<Customer> getAll(DataTablesInput input) {
        return repository.findAll(input);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }
}

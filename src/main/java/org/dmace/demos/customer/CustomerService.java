package org.dmace.demos.customer;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import java.util.List;

public interface CustomerService {

    DataTablesOutput<Customer> getAll(DataTablesInput input);

    List<Customer> findAll();
}

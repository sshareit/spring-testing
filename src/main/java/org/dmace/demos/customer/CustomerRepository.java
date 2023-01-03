package org.dmace.demos.customer;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

public interface CustomerRepository extends DataTablesRepository<Customer, String> {
}

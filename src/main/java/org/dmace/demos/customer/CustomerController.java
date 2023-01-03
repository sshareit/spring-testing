package org.dmace.demos.customer;

import jakarta.validation.Valid;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String customers() {
        return "customers";
    }

    @ResponseBody
    @GetMapping(value = "/customers")
    public DataTablesOutput<Customer> list(@Valid DataTablesInput input) {
        return service.getAll(input);
    }

    @ResponseBody
    @PostMapping(value = "/customers")
    public DataTablesOutput<Customer> listPOST(@Valid @RequestBody DataTablesInput input) {
        return service.getAll(input);
    }
}

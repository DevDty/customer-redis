package NTTDATA.mscustomer_redis.controller;

import NTTDATA.mscustomer_redis.domain.Customer;
import NTTDATA.mscustomer_redis.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customer")
    public Map<String, Customer> findAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer findById(@PathVariable String id) {
        return customerRepository.findById(id);
    }

    @PostMapping("/customer")
    public void create(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }

    @DeleteMapping("/customer/{id}")
    public void delete(@PathVariable String id) {
        customerRepository.delete(id);
    }
}

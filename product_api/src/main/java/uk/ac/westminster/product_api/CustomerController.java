package uk.ac.westminster.product_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        Address address = new Address("255 Cooray Street", "Colombo", "12560");
        return new Customer(id, "Peter Parker", "peterparker@gmail.com", address);
    }
}
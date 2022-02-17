package duy.com.demo.service;

import duy.com.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();
    void createCustomer(Customer customer);
    Customer getCustomerById(int id);
    void updateCustomer(int id, Customer customer);
    void deleteCustomerById(int id);
}

package model.service.impl;

import model.bean.Customer;
import model.repository.ICustomer;
import model.repository.impl.CustomerRepository;
import model.repository.impl.ServiceRepository;
import model.service.ICustomerService;

import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {

    ICustomer customerRepository = new CustomerRepository();

    @Override
    public List<Customer> getAllCustomer() {

        return customerRepository.getAllCustomer();
    }

    @Override
    public List<Customer> search() {
        return null;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Map<String, String> save(Customer customer) {
        return null;
    }

    @Override
    public void edit(Customer customer) {

    }
}

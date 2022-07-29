package model.service;

import model.bean.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerService {
    List<Customer> getAllCustomer();
    List<Customer> search();
    Customer findById(int id);
    boolean delete(int id);
    Map<String,String> save(Customer customer);
    void edit(Customer customer);
}

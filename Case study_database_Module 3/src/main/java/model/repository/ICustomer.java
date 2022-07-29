package model.repository;

import model.bean.Customer;

import java.util.List;

public interface ICustomer {
    List<Customer> getAllCustomer();
    List<Customer> search();
    Customer findById(int id);
    boolean delete(int id);
    boolean save(Customer customer);
    void edit(Customer customer);
}

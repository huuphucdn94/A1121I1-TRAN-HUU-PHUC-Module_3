package model.repository.impl;

import model.bean.Customer;
import model.repository.BaseRepository;
import model.repository.ICustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomer {
    private final String FIND_ALL = "SELECT * FROM customer";

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = new ArrayList<>();

        // kết nội dB=> lấy list
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement ps = connection.prepareStatement(FIND_ALL);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int customer_id = resultSet.getInt("customer_id"); // colummLable : tên  thuocj tính của bảng
                String customer_name  = resultSet.getString("customer_name");
                String customer_birthday  = resultSet.getString("customer_birthday");
                String customer_gender  = resultSet.getString("customer_gender");
                int customer_id_card  = resultSet.getInt("customer_id_card");
                int customer_phone  = resultSet.getInt("customer_phone");
                String customer_email  = resultSet.getString("customer_email");
                int customer_type_id  = resultSet.getInt("customer_type_id");
                String customer_address  = resultSet.getString("customer_address");

                Customer customer = new Customer(customer_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_type_id, customer_address);

                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return customerList;
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
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public void edit(Customer customer) {

    }
}

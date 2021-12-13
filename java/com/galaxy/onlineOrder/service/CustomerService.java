package com.galaxy.onlineOrder.service;

import com.galaxy.onlineOrder.dao.CustomerDao;
import com.galaxy.onlineOrder.entity.Cart;
import com.galaxy.onlineOrder.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void signUp(Customer customer) {
        Cart cart = new Cart();
        customer.setCart(cart);

        customer.setEnabled(true);
        customerDao.signUp(customer);
    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }

}

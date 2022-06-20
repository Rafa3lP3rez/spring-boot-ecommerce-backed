package com.ecommerce.service;

import com.ecommerce.dao.CustomerRepository;
import com.ecommerce.dto.Purchase;
import com.ecommerce.dto.PurchaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class CheckoutImpl implements CheckoutService{


    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrive the order info from dto

        // generate tracking number

        // populate order with orderItem

        // populate order with billingAddress and shippingAddress

        // pupulate customer with order

        // save to the database

        // return a response




        return null;
    }


}

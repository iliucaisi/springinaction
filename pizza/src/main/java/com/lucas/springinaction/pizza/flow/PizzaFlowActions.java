package com.lucas.springinaction.pizza.flow;

import com.lucas.springinaction.pizza.domain.*;
import com.lucas.springinaction.pizza.service.CustomerNotFoundException;
import com.lucas.springinaction.pizza.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Component
public class PizzaFlowActions {
    private static final Logger LOGGER = LogManager.getLogger(PizzaFlowActions.class);
    @Autowired
    private CustomerService customerService;

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        Customer customer = customerService.lookupCustomer(phoneNumber);
        if (Objects.nonNull(customer)) {
            return customer;
        } else {
            throw new CustomerNotFoundException();
        }
    }

    public void addCustomer(Customer customer) {
        LOGGER.debug("addCustomer");
    }

    public Payment verifyPayment(PaymentDetails paymentDetails) {
        Payment payment = null;
        if (paymentDetails.getPaymentType().equals(PaymentType.CREDIT_CARD)) {
            payment = new CreditCardPayment();
        } else {
            payment = new CashOrCheckPayment();
        }

        return payment;
    }

    public void saveOrder(Order order) {
        LOGGER.debug("saveOrder");
    }

    public boolean checkDeliveryArea(String zipCode) {
        LOGGER.debug("checkDeliveryArea");
        return "75075".equals(zipCode);
    }


}

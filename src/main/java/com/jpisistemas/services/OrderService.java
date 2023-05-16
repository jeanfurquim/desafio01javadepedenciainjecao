package com.jpisistemas.services;

import com.jpisistemas.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {

        double discount = order.getBasic() * (order.getDiscount() / 100.0);
        double price = order.getBasic() - discount;

        return price + shippingService.shipment(order);
    }
}

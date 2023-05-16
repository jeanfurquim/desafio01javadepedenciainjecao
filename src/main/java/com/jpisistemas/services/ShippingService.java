package com.jpisistemas.services;

import com.jpisistemas.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double valueInitial = order.getBasic();
        double freight = 0.0;

        if (valueInitial < 100.0){
            freight = 20.0;
        } else if
            (valueInitial >= 100.0 && valueInitial <=200.0 ) {
            freight = 12.0;
        }
         return freight;

    }
}

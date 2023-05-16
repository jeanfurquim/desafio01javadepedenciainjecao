package com.jpisistemas.desafio01dependeciaseinjecao;

import com.jpisistemas.entities.Order;
import com.jpisistemas.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jpisistemas"})
public class Desafio01dependeciaseinjecaoApplication implements CommandLineRunner {
    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01dependeciaseinjecaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 01
        Order order1 = new Order(1034, 150.0, 20.0);
        System.out.println("Exemplo 1:");
        System.out.println("Pedido código " + order1.getCode());
        System.out.printf("Valor total: R$ %.2f%n" , orderService.total(order1));
        System.out.println();

        // 02
        Order order2 = new Order(2282, 800.0, 10.0);
        System.out.println("Exemplo 02:");
        System.out.println("Pedido código " + order2.getCode());
        System.out.printf("Valor total: R$ %.2f%n" , orderService.total(order2));
        System.out.println();

        // 03
        Order order3 = new Order(1309, 95.90, 0.0);
        System.out.println("Exemplo 03:");
        System.out.println("Pedido código " + order3.getCode());
        System.out.printf("Valor total: R$ %.2f%n" , orderService.total(order3));
        System.out.println();
    }
}

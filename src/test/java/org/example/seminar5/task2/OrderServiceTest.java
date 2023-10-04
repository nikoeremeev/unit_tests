package org.example.seminar5.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    OrderService orderService;

    PaymentService paymentService;

    @BeforeEach
    void setUp(){
        paymentService = Mockito.spy(PaymentService.class);
        orderService = new OrderService(paymentService);
    }

    @Test
    void placeOrder() {
        boolean bool = orderService.placeOrder("1",0.123);
        assertTrue(bool);
    }
}
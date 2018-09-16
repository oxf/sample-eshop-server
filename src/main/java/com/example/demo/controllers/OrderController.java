package com.example.demo.controllers;

import com.example.demo.model.Order;
import com.example.demo.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrdersRepository ordersRepository;

    @GetMapping("/order")
    public List<Order> getAllOrders() {
        System.out.println("hello");
        return ordersRepository.findAll();
    }
}

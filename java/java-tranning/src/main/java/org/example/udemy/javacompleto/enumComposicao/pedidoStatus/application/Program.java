package org.example.udemy.javacompleto.enumComposicao.pedidoStatus.application;

import org.example.udemy.javacompleto.enumComposicao.pedidoStatus.entities.Order;
import org.example.udemy.javacompleto.enumComposicao.pedidoStatus.entities.enums.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Order order = new Order(29, new Date(), OrderStatus.DELIVERED);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);

    }

}

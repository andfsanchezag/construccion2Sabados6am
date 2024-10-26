/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dao;

import app.dao.interfaces.OrderDao;
import app.dao.repositories.OrderRepository;
import app.dto.OrderDto;
import app.helpers.Helper;
import app.model.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ESTUDIANTE
 */

@Service
@NoArgsConstructor
@Getter
@Setter
public class OrderDaoImplementation implements OrderDao{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void createOrder(OrderDto orderDto) throws Exception {
       
    }

    @Override
    public OrderDto findById(OrderDto orderDto) {
        Order order = orderRepository.findById(orderDto.getId());
        return Helper.parse(order);
    }
    
}
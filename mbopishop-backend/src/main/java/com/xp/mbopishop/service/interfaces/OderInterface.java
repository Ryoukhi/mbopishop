package com.xp.mbopishop.service.interfaces;

import com.xp.mbopishop.entity.Order;
import java.util.List;

public  interface OderInterface {
    Order save (Order order);

    List<Order> getAll();

    Order getById(long id);

    Order update(long id, Order order);

    void delete(long id);
}
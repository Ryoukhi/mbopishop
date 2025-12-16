package com.xp.mbopishop.service.interfaces;

import com.xp.mbopishop.entity.Cart;

import java.util.List;




public interface CartInterface {

    Cart save(Cart cart);

    List<Cart> getAll();

    Cart getById(long id);

    Cart update(long id, Cart cart);

    void delete(long id);


}
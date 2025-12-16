package com.xp.mbopishop.service.interfaces;

import com.xp.mbopishop.entity.Payment;

import java.util.List;

public interface PaymentInterface {

    Payment save(Payment payement);

    List<Payment> getAll();

    Payment getById(long id);

    Payment update(long id, Payment payment);

    void delete(long id);

}
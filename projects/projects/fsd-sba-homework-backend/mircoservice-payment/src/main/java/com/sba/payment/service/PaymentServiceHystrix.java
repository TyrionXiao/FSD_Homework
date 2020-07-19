package com.sba.payment.service;

import demo.springboot.domain.Payment;
import org.springframework.stereotype.Component;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 10:33
 */
@Component
public class PaymentServiceHystrix implements PaymentService {
    public static String ERRORmsg="Service down, please restart server and retry";
    @Override
    public String getById(Long id) {
        return ERRORmsg;
    }

    @Override
    public Payment update(Payment payment) {
        return null;
    }

    @Override
    public Payment update(Long trainingid) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

package com.sba.payment.controller;

import com.sba.payment.service.PaymentService;
import demo.springboot.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/15 0:55
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/Payment/{id}", method = RequestMethod.GET)
    public String getPayment(@PathVariable("id") Long id) {
        return paymentService.getById(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public Payment update(@PathVariable("id") Long id){
        return paymentService.update(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Payment update(@RequestBody Payment payment){

        return paymentService.update(payment);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void deleteById(@PathVariable("id") Long id){
        paymentService.deleteById(id);
    }
}

package com.sba.payment.service;

import demo.springboot.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/15 0:50
 */
@FeignClient(value = "microservice-user",fallback = PaymentServiceHystrix.class)
public interface PaymentService {
    @RequestMapping(value = "/Payment/get/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") Long id);

    @RequestMapping(value = "/Payment/create", method = RequestMethod.POST)
    public Payment update(@RequestBody Payment payment);

    @RequestMapping(value = "/Payment/update/{id}", method = RequestMethod.POST)
    public Payment update(@PathVariable("id") Long trainingid);

    @RequestMapping(value = "/Payment/delete/{id}", method = RequestMethod.GET)
    public void deleteById(@PathVariable("id") Long id);
}

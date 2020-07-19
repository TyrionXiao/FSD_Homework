package com.sba.training.service;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 12:26
 */

import demo.springboot.domain.Training;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "microservice-user",fallback = TrainingServiceHystrix.class)
public interface TrainingService {
    @RequestMapping(value = "/Training/get/{id}", method = RequestMethod.GET)
    public Training findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/Training/create", method = RequestMethod.POST)
    public Training saveUser(@RequestBody Training training);

    @RequestMapping(value = "/Training/update/", method = RequestMethod.POST)
    public Training updateUser(@RequestBody Training training);

    @RequestMapping(value = "/Training",method = RequestMethod.GET)
    public List<Training> findAll();
}

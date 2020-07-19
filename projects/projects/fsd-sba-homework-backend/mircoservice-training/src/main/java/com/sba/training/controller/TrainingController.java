package com.sba.training.controller;

import com.sba.training.service.TrainingService;
import demo.springboot.domain.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 12:27
 */
@RestController
@RequestMapping(value = "/Training")
@ResponseBody
public class TrainingController {

@Autowired
    TrainingService trainingService;
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Training findById(@PathVariable("id") Long id) {
        return trainingService.findById(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Training saveUser(@RequestBody Training training) {
        return trainingService.saveUser(training);
    }

    @RequestMapping(value = "/update/", method = RequestMethod.POST)
    public Training updateUser(@RequestBody Training training) {
        return trainingService.updateUser(training);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Training> findAll() {
        return trainingService.findAll();
    }
}

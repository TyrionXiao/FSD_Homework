package com.sba.training.service;

import demo.springboot.domain.Training;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 12:35
 */
@Component
public class TrainingServiceHystrix implements TrainingService {
    @Override
    public Training findById(Long id) {
        return null;
    }

    @Override
    public Training saveUser(Training training) {
        return null;
    }

    @Override
    public Training updateUser(Training training) {
        return null;
    }

    @Override
    public List<Training> findAll() {
        return null;
    }
}

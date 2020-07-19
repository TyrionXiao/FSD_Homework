package demo.springboot.service;

import demo.springboot.domain.Training;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/8 22:57
 */

public interface TrainingService {
    public Training save(Training training);
    public Training findById(long id);
    public List<Training> findByUsername(String username);
    public void  deleteById(long id);
    public  List<Training> findAll();
    public void deleteTraining(Training training);
}

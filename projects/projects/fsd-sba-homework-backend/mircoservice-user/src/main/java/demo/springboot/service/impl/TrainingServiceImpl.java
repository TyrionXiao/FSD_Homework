package demo.springboot.service.impl;

import demo.springboot.domain.Training;
import demo.springboot.repository.TrainingRepository;
import demo.springboot.repository.UserRepository;
import demo.springboot.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/8 22:57
 */
@Service
public class TrainingServiceImpl implements TrainingService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    TrainingRepository trainingRepository;
    @Override
    public Training save(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public Training findById(long id) {
        return trainingRepository.findById(id);
    }

    @Override
    public List<Training> findByUsername(String username) {
        return trainingRepository.findByUserName(username);
    }

    @Override
    public void deleteById(long id) {
        trainingRepository.deleteById(id);
    }

    @Override
    public List<Training> findAll() {
        return trainingRepository.findAll();
    }

    @Override
    public void deleteTraining(Training training) {
        trainingRepository.delete(training);
    }


}

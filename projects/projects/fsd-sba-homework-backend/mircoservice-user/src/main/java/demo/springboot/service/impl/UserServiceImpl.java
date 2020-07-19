package demo.springboot.service.impl;

import demo.springboot.domain.User;
import demo.springboot.repository.SkillRepository;
import demo.springboot.repository.TrainingRepository;
import demo.springboot.repository.UserRepository;
import demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/7 18:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(long id) {
        return userRepository.findByUserID(id);
    }

    @Override
    public String findUserRole(String username) {
        return userRepository.findUserRole(username);
    }

    @Override
    public List<User> findBySkillId(long id) {
        return userRepository.findBySkillId(id);
    }

    @Override
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByTrainingId(long id) {
        return userRepository.findByTrainingId(id);
    }



    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }


}

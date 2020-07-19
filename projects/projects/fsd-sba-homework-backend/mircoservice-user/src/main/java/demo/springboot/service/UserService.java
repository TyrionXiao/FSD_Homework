package demo.springboot.service;

import demo.springboot.domain.User;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/7 18:43
 */
public interface UserService {
    public User save(User user);
    public User findById(long id);
    public String findUserRole(String username);
    List<User> findBySkillId(long id);
    List<User> findUsers();
    List<User> findByTrainingId(long id);
    public void  deleteById(long id);

}

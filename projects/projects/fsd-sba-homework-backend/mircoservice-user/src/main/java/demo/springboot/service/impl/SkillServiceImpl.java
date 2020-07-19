package demo.springboot.service.impl;

import demo.springboot.domain.Skill;
import demo.springboot.repository.SkillRepository;
import demo.springboot.repository.UserRepository;
import demo.springboot.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/8 0:46
 */
@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    SkillRepository skillRepository;
    @Override
    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill findById(long id) {
        return skillRepository.findById(id);
    }

    @Override
    public List<Skill> findByUsername(String username) {
        return skillRepository.findByUserName(username);
    }

    @Override
    public void deleteById(long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public void deleteSkill(Skill skill) {
        skillRepository.delete(skill);
    }

}

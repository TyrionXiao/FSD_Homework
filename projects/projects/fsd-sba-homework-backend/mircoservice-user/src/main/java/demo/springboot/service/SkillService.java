package demo.springboot.service;

import demo.springboot.domain.Skill;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/8 22:57
 */

public interface SkillService {
    public Skill save(Skill skill);
    public Skill findById(long id);
    public List<Skill> findByUsername(String username);
    public void  deleteById(long id);
    public  List<Skill> findAll();
    public void deleteSkill(Skill skill);
}

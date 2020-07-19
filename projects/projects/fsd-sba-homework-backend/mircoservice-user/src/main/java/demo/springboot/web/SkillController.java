package demo.springboot.web;

import demo.springboot.domain.Skill;
import demo.springboot.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/9 0:59
 */
@Controller
@RequestMapping(value = "/skill")
@ResponseBody
public class SkillController {
    @Autowired
    SkillService skillService;
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Skill findById(@PathVariable("id") Long id) {
        return skillService.findById(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Skill saveUser(@RequestBody Skill skill) {
        return skillService.save(skill);
    }

    @RequestMapping(value = "/update/", method = RequestMethod.POST)
    public Skill updateUser(@RequestBody Skill skill) {
        return skillService.save(skill);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Skill> findAll() {
        return  skillService.findAll();
    }
}

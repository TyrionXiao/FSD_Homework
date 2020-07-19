package demo.springboot.web;

import demo.springboot.domain.User;
import demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/7 18:50
 */

@Controller
@RequestMapping(value = "/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/getSkill/{id}", method = RequestMethod.GET)
    public List<User>  findBySkillId(@PathVariable("id") Long id) {
        return userService.findBySkillId(id);
    }

    @RequestMapping(value = "/getTraining/{id}", method = RequestMethod.GET)
    public List<User>  findByTrainingId(@PathVariable("id") Long id) {
        return userService.findByTrainingId(id);
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        return  userService.findUsers();
    }
}

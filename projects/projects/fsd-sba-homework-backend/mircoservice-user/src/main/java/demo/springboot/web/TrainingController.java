package demo.springboot.web;

import demo.springboot.domain.Training;
import demo.springboot.service.TrainingService;
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
        return trainingService.save(training);
    }

    @RequestMapping(value = "/update/", method = RequestMethod.POST)
    public Training updateUser(@RequestBody Training training) {
        return trainingService.save(training);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Training> findAll() {
        return  trainingService.findAll();
    }
}

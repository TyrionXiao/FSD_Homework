package demo.springboot.web;

import demo.springboot.domain.Technologies;
import demo.springboot.repository.TechnologiesRepository;
import demo.springboot.service.TechnologiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 17:06
 */
@Controller
@RequestMapping(value = "/Technologies")
@ResponseBody
public class TechnologiesController {
    @Autowired
    TechnologiesService technologiesService;
    @Autowired
    TechnologiesRepository technologiesRepository;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<Technologies> getById(@PathVariable("id") Long id){
        return technologiesService.findById(id);
    }
    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
    public Technologies findByName(@PathVariable("name")String name){
        return technologiesService.findByName(name);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Technologies update(@RequestBody Technologies mentorCalendar){
        return technologiesService.save(mentorCalendar);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void deleteById(@PathVariable("id") Long id){
        technologiesService.deleteById(id);
    }
}

package demo.springboot.web;

import demo.springboot.domain.MentorCalendar;
import demo.springboot.service.MentorCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 17:06
 */
@Controller
@RequestMapping(value = "/MentorCalendar")
@ResponseBody
public class MentorCalendarController {
    @Autowired
    MentorCalendarService mentorCalendarService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAll(){
        return mentorCalendarService.findAll().toString();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public MentorCalendar getById(@PathVariable("id") Long id){
        return mentorCalendarService.findById(id);
    }
    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
    public MentorCalendar findByName(@PathVariable("name")String name){
        return mentorCalendarService.findByName(name);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public MentorCalendar update(@RequestBody MentorCalendar mentorCalendar){
        return mentorCalendarService.save(mentorCalendar);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void deleteById(@PathVariable("id") Long id){
        mentorCalendarService.deleteById(id);
    }
}

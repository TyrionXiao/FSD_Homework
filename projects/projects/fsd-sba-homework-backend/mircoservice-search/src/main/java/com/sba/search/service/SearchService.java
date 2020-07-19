package com.sba.search.service;

import demo.springboot.domain.MentorCalendar;
import demo.springboot.domain.Skill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 1:03
 */
@FeignClient(value = "microservice-user",fallback =SearchServiceHystrix.class)
public interface SearchService {

    @RequestMapping(value = "/MentorCalendar", method = RequestMethod.GET)
    public List<MentorCalendar> getAllMentor();

    @RequestMapping(value = "/skill/get/{id}", method = RequestMethod.GET)
    public Skill getSkillById(@PathVariable("id") Long id);
}

package com.sba.search.service;

import demo.springboot.domain.MentorCalendar;
import demo.springboot.domain.Skill;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 12:17
 */
@Component
public class SearchServiceHystrix implements SearchService {
    @Override
    public List<MentorCalendar> getAllMentor() {
        return null;
    }

    @Override
    public Skill getSkillById(Long id) {
        return null;
    }
}

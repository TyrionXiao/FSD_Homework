package com.sba.search.controller;

import com.sba.search.model.SearchResult;
import com.sba.search.service.SearchService;
import demo.springboot.domain.MentorCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 1:03
 */
@RestController
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<SearchResult> search(@RequestParam("timezone")String timezone,@RequestParam("tech")String tech){
        SearchResult searchResult=new SearchResult();
        List<MentorCalendar> mentors=getMentors();
        List<SearchResult> list= null ;

        for(int i=0;i<mentors.size();i++){
            if(mentors.get(i).getStartTime().equals(timezone)){
                searchResult.setMentorname(mentors.get(i).getMentorName());
                searchResult.setId(mentors.get(i).getMentorId());
                searchResult.setTechnologies(searchService.getSkillById(mentors.get(i).getMentorId()).getToc());
                list.add(searchResult);
            }
        }

                return list;
    }

    public List<MentorCalendar> getMentors(){
        return searchService.getAllMentor();
    }

}

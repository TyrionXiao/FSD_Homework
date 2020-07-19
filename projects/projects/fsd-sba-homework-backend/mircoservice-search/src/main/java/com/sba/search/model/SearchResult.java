package com.sba.search.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/19 10:53
 */
@EntityScan
public class SearchResult {
    private Long id;
    private String mentorname;
    private String technologies;
    private String experience;
    private Float fees=0.0f;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMentorname() {
        return mentorname;
    }

    public void setMentorname(String mentorname) {
        this.mentorname = mentorname;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Float getFees() {
        return fees;
    }

    public void setFees(Float fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "id=" + id +
                ", mentorname='" + mentorname + '\'' +
                ", technologies='" + technologies + '\'' +
                ", experience='" + experience + '\'' +
                ", fees=" + fees +
                '}';
    }
}

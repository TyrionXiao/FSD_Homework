package demo.springboot.service;

import demo.springboot.domain.MentorCalendar;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 15:48
 */
public interface MentorCalendarService {
    public MentorCalendar save(MentorCalendar mentorCalendar);
    List<MentorCalendar> findAll();
    public MentorCalendar findById(long id);

    public MentorCalendar findByName(String name);

    public void deleteById(long id);
}

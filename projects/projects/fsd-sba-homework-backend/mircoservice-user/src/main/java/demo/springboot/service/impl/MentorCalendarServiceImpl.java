package demo.springboot.service.impl;

import demo.springboot.domain.MentorCalendar;
import demo.springboot.repository.MentorCalendarRepository;
import demo.springboot.service.MentorCalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 16:54
 */
@Service
public class MentorCalendarServiceImpl  implements MentorCalendarService {
    @Autowired
    MentorCalendarRepository mentorCalendarRepository;
    @Override
    public MentorCalendar save(MentorCalendar mentorCalendar) {
        return mentorCalendarRepository.save(mentorCalendar);
    }

    @Override
    public List<MentorCalendar> findAll() {
        return mentorCalendarRepository.findAll();
    }

    @Override
    public MentorCalendar findById(long id) {
        return mentorCalendarRepository.findById(id);
    }

    @Override
    public MentorCalendar findByName(String name) {
        return mentorCalendarRepository.findByName(name);
    }

    @Override
    public void deleteById(long id) {
        mentorCalendarRepository.deleteById(id);
    }
}

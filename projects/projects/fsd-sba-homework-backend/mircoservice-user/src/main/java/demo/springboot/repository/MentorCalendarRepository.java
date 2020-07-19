package demo.springboot.repository;

import demo.springboot.domain.MentorCalendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 15:11
 */
public interface MentorCalendarRepository extends JpaRepository<MentorCalendar, Long> {
    @Override
    List<MentorCalendar> findAll();

    @Override
    List<MentorCalendar> findAllById(Iterable<Long> longs);

    @Query("select M from MentorCalendar M   where M.mentorId=:id")
    public MentorCalendar findById(@Param("id") long id);

    @Query("select M from MentorCalendar M   where M.mentorName=:name")
    public MentorCalendar findByName(@Param("name") String name);
}

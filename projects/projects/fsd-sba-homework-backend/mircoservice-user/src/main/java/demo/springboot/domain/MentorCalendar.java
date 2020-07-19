package demo.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/17 0:39
 */
@Entity
@Table(name="MENTOR_CALERDAR")
public class MentorCalendar {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="MENTOR_NAME")
    private String mentorName;

    @Column(name="MENTOR_id")
    private long mentorId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "START_DATE")
    private String startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "END_DATE")
    private String endDate;

    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "START_TIME")
    private String startTime;

    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "END_TIME")
    private String endTime;

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public long getMentorId() {
        return mentorId;
    }

    public void setMentorId(long mentorId) {
        this.mentorId = mentorId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}

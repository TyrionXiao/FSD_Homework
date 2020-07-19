package demo.springboot.domain;

import javax.persistence.*;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/17 0:37
 */
@Entity
@Table(name="PAYMENT")
public class Payment {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name="MENTOR_NAME")
    private String mentorName;

    @Column(name="MENTOR_id")
    private String mentorId;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="USER_ID")
    private String uesrId;

    @Column(name="PAY_AMOUNT")
    private Float payAmout;
    /**
     * 状态1 ， 2 ，3， 4
     */
    @Column(name="PROGRESS")
    private String progress;
    /**
     * 记录USER是否已付款
     */
    @Column(name="PAYED")
    boolean payed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorId() {
        return mentorId;
    }

    public void setMentorId(String mentorId) {
        this.mentorId = mentorId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUesrId() {
        return uesrId;
    }

    public void setUesrId(String uesrId) {
        this.uesrId = uesrId;
    }

    public Float getPayAmout() {
        return payAmout;
    }

    public void setPayAmout(Float payAmout) {
        this.payAmout = payAmout;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "mentorName='" + mentorName + '\'' +
                ", mentorId='" + mentorId + '\'' +
                ", userName='" + userName + '\'' +
                ", uesrId='" + uesrId + '\'' +
                ", payAmout='" + payAmout + '\'' +
                ", progress='" + progress + '\'' +
                '}';
    }
}

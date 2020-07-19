package demo.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/8 0:00
 */
@Entity
@Table(name="TRAINING")
public class Training {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "_id")
    private Long id;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Column(name="T_NAME")
    private String T_Name;

    @Column(name = "STATUS")
    private String status;

    /**
     * 课程进度
     */
    @Column(name = "PROGRESS")
    private Integer progress=0;

    /**
     * 费用
     */
    @Column(name="FEES")
    private Float fees=0.0f;
    /**
     *  佣金金额
     */

    @Column(name = "COMMISSION_AMOUNT")
    private Float commissionAmount=0.0f;

    /**
     * //付款比例
     */
    @Column(name ="RATING")
    private Integer rating=0;

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

    @Column(name = "AMOUNT_RECEIVED")
    private Float amountReceived=0.0f;

    @ManyToMany(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_NAME",referencedColumnName = "user_name")
    private List<User> users;

    @Column(name = "MENTOR_ID")
    private Long mentorId;

    @Column(name = "MENTOR_NAME")
    private String mentorname;

    @OneToOne(targetEntity= Skill.class,fetch=FetchType.LAZY)
    @JoinColumn(name = "SKILL_NAME",referencedColumnName = "name")
    private Skill skill;

    @OneToOne(targetEntity= Payment.class,fetch=FetchType.LAZY)
    @JoinColumn(name = "RAZORPAY_PAYMENT_ID",referencedColumnName = "id")
    private String razorpayPaymentId;

    public Training() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getT_Name() {
        return T_Name;
    }

    public void setT_Name(String t_Name) {
        T_Name = t_Name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Float getFees() {
        return fees;
    }

    public void setFees(Float fees) {
        this.fees = fees;
    }

    public Float getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Float commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
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

    public Float getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(Float amountReceived) {
        this.amountReceived = amountReceived;
    }


    public Long getMentorId() {
        return mentorId;
    }

    public void setMentorId(Long mentorId) {
        this.mentorId = mentorId;
    }



    public String getRazorpayPaymentId() {
        return razorpayPaymentId;
    }

    public void setRazorpayPaymentId(String razorpayPaymentId) {
        this.razorpayPaymentId = razorpayPaymentId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", T_Name='" + T_Name + '\'' +
                ", status='" + status + '\'' +
                ", progress=" + progress +
                ", fees=" + fees +
                ", commissionAmount=" + commissionAmount +
                ", rating=" + rating +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", amountReceived=" + amountReceived +
                ", users=" + users +
                ", mentorId=" + mentorId +
                ", skill=" + skill +
                ", razorpayPaymentId='" + razorpayPaymentId + '\'' +
                '}';
    }

    public String getMentorname() {
        return mentorname;
    }

    public void setMentorname(String mentorname) {
        this.mentorname = mentorname;
    }
}

package demo.springboot.domain;

import java.util.Date;
import java.util.List;
import javax.management.relation.Role;
import javax.persistence.*;


/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/7 18:34
 */
@Entity

@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="user_name")
    private String username;
    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="reg_code")
    private  String regCode="";


    @Column(name="contact_number")
    private String contactNumber;

    @Column(name="role")
    private Role role;

    @Column (name = "linkedin_url")
    private String linkedinUrl=null;

    @Column(name="years_of_experience")
    private Float yearsOfExperience;

    @Column(name="active")
    private Boolean active=false;

    @Column(name = "confirmed_signup")
    private Boolean confirmedSignUp=false;

    @Column(name="reset_password")
    private Boolean resetPassword=false;

    @Column(name = "reset_password_date")
    private Date resetPasswordDate;

    @ManyToMany(targetEntity = Training.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "TRAINING_ID",referencedColumnName = "id")
    private List<Training> Trainings;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public Float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getConfirmedSignUp() {
        return confirmedSignUp;
    }

    public void setConfirmedSignUp(Boolean confirmedSignUp) {
        this.confirmedSignUp = confirmedSignUp;
    }

    public Boolean getResetPassword() {
        return resetPassword;
    }

    public void setResetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
    }

    public Date getResetPasswordDate() {
        return resetPasswordDate;
    }

    public void setResetPasswordDate(Date resetPasswordDate) {
        this.resetPasswordDate = resetPasswordDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", regCode='" + regCode + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", role=" + role +
                ", linkedinUrl='" + linkedinUrl + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", active=" + active +
                ", confirmedSignUp=" + confirmedSignUp +
                ", resetPassword=" + resetPassword +
                ", resetPasswordDate=" + resetPasswordDate +
                ", Trainings=" + Trainings +
                '}';
    }
}

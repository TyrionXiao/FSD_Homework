package demo.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;


/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/7 23:58
 */
@Entity
@Table(name="SKILL")
public class Skill {
    private  static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name = "toc",nullable = false)
    private String toc;

    /**
     * 一个mentor 角色的user对应多个skill
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="MENTOR_id",referencedColumnName = "id")
    private User user;

    @Column(name = "prerequisites",nullable = false)
    private String prerequisites;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToc() {
        return toc;
    }

    public void setToc(String toc) {
        this.toc = toc;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
}

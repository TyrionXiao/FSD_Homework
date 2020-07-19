package demo.springboot.domain;

import javax.persistence.*;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/17 0:41
 */
@Entity
@Table(name="TECHNOLOGIES")
public class Technologies {
    @Id
    @Column(name = "_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="TECH_NAME")
    private String name;

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

}

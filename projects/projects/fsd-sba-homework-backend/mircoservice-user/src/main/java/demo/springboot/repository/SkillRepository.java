package demo.springboot.repository;

import demo.springboot.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/8 0:03
 */
public interface SkillRepository extends JpaRepository<Skill,Long> {
    /**
     * 根据ID查询
     * @param longs
     * @return
     */
    @Override
    List<Skill> findAllById(Iterable<Long> longs);

    /**
     * 查询所有的技能
     * @return
     */
    @Override
    List<Skill> findAll();


    @Query("select S from Skill S where S.name=:name")
    public  Skill findByName(@Param("name") String name);

    @Query("select S from Skill S where S.id=:id")
    public Skill findById(@Param("id") long id);

    /**
     * 根据userid查询Skill
     * @param id
     * @return
     */
    @Query("select s from Skill s  join User u where u.id=:id")
    public List<Skill> findByUserId(@Param("id") long id);

    /**
     * 根据username查询Skill
     * @param username
     * @return
     */
    @Query("select s from Skill s  join User u where u.username=:username")
    public List<Skill> findByUserName(@Param("username") String username);
}

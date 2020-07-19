package demo.springboot.repository;

import demo.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/7 18:40
 */
public interface UserRepository  extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();


    @Query("select u from User u where u.id=:id")
    public User findByUserID(@Param("id") long id);

    @Query("select u.role  from User u where u.username=:username")
    public String findUserRole(@Param("username") String username);

    @Query("select u from User u join Skill s where s.id=:id")
    public List<User> findBySkillId(@Param("id") long id);

    @Query("select u from User u join Training t where t.id=:id")
    public List<User> findByTrainingId(@Param("id") long id);

}

package demo.springboot.repository;

import demo.springboot.domain.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/8 0:14
 */
public interface TrainingRepository extends JpaRepository<Training,Long> {
    @Override
    List<Training> findAllById(Iterable<Long> longs);

    @Query("select t from Training t where t.id=:id")
    public Training findById(@Param("id") long id);

    @Query("select T from Training T where T_Name=:T_Name")
    public Training findByName(@Param("T_Name") String T_Name);

    @Override
    List<Training> findAll();

    @Query("select t from Training t  join User u where u.id=:id")
    public List<Training> findByUserId(@Param("id") long id);

    @Query("select t from Training t  join User u where u.username=:username")
    public List<Training> findByUserName(@Param("username") String username);
}

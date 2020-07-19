package demo.springboot.repository;

import demo.springboot.domain.Technologies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 15:12
 */
public interface TechnologiesRepository extends JpaRepository<Technologies, Long> {
    @Override
    List<Technologies> findAll();

    @Override
    Optional<Technologies> findById(Long aLong);

    @Query("select T from  Technologies T where T.name=:name")
    public Technologies findByName(@Param("name") String name);
}

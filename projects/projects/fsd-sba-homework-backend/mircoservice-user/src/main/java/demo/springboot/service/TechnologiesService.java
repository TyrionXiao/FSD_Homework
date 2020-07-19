package demo.springboot.service;

import demo.springboot.domain.Technologies;

import java.util.List;
import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 15:49
 */
public interface TechnologiesService {

    List<Technologies> findAll();

    public Optional<Technologies> findById(Long aLong);

    public Technologies findByName(String name);

    public void deleteById(long id);

    public Technologies save(Technologies technologies);
}

package demo.springboot.service.impl;

import demo.springboot.domain.Technologies;
import demo.springboot.repository.TechnologiesRepository;
import demo.springboot.service.TechnologiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 16:54
 */
@Service
public class TechnologiesServiceImpl implements TechnologiesService {
    @Autowired
    TechnologiesRepository technologiesRepository;
    @Override
    public List<Technologies> findAll() {
        return technologiesRepository.findAll();
    }

    @Override
    public Optional<Technologies> findById(Long aLong) {
        return technologiesRepository.findById(aLong);
    }

    @Override
    public Technologies findByName(String name) {
        return technologiesRepository.findByName(name);
    }

    @Override
    public void deleteById(long id) {
        technologiesRepository.deleteById(id);

    }

    @Override
    public Technologies save(Technologies technologies) {
        return technologiesRepository.save(technologies);
    }
}

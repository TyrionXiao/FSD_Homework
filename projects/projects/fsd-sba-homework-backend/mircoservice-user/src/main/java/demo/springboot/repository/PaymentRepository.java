package demo.springboot.repository;

import demo.springboot.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 15:11
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    @Override
    List<Payment> findAll();

    @Override
    Optional<Payment> findById(Long aLong);
}

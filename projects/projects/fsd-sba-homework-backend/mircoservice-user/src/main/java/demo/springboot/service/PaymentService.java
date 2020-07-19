package demo.springboot.service;

import demo.springboot.domain.Payment;

import java.util.List;
import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 15:48
 */
public interface PaymentService {

    List<Payment> findAll();

    public Optional<Payment> findById(Long aLong);
    public void deleteById(long id);
    public Payment save(Payment payment);
    public Float calculatePay(Integer i,Integer rate,Float fee);
}

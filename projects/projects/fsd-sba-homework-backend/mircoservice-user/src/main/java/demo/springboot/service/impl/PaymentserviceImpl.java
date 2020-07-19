package demo.springboot.service.impl;

import demo.springboot.domain.Payment;
import demo.springboot.repository.PaymentRepository;
import demo.springboot.service.PaymentService;
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
public class PaymentserviceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payment> findById(Long aLong) {
        return paymentRepository.findById(aLong);
    }

    @Override
    public void deleteById(long id) {
        paymentRepository.deleteById(id);

    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Float calculatePay(Integer i,Integer rate,Float fee) {
        switch (i){
            case 1:
                return fee*rate*0.25f;

            case 2: return  fee*rate*0.5f;

            case 3: return fee*rate*0.75f;

            case 4:return fee*rate;

            default: return 0.0f;

        }


    }
}

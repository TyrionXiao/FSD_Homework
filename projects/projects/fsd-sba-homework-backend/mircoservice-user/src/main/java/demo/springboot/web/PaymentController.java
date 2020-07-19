package demo.springboot.web;

import demo.springboot.domain.Payment;
import demo.springboot.domain.Training;
import demo.springboot.service.PaymentService;
import demo.springboot.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author DengChunXiao
 * @version 1.0
 * @date 2020/7/18 17:06
 */
@Controller
@RequestMapping(value = "/Payment")
@ResponseBody
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @Autowired
    TrainingService trainingService;



    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<Payment> getById(@PathVariable("id") Long id){
        return paymentService.findById(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void deleteById(@PathVariable("id") Long id){
        paymentService.deleteById(id);
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Payment update(@RequestBody Payment payment){

        return paymentService.save(payment);
    }

    /**
     *
     * @param id,获取TraingId
     * @return
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public Payment update(@PathVariable("id") Long id){
        Payment payment=new Payment();
        Training training=new Training();
        training=trainingService.findById(id);
        payment.setMentorId(id.toString());
        payment.setMentorName(training.getMentorname());
        payment.setPayed(training.getStatus().equals("payed"));
        payment.setProgress(training.getProgress().toString());
        payment.setPayAmout(paymentService.calculatePay(training.getProgress(),training.getRating(),training.getFees()));

        return paymentService.save(payment);
    }

}

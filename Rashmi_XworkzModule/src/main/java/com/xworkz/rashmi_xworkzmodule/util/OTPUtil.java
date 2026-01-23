package com.xworkz.rashmi_xworkzmodule.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.Random;


public class OTPUtil {

    public  static int getRandomOtp() {
        Random randomNumber = new Random();
        int randomOtp = randomNumber.nextInt(999999) + 100000;
        System.out.println("Random generated otp : " + randomOtp);
        return randomOtp;
    }

}

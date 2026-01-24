package com.xworkz.rashmi_xworkzmodule.util;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;


public class OTPUtil {

    public  static int getRandomOtp() {
        Random randomNumber = new Random();
        int randomOtp = randomNumber.nextInt(999999) + 100000;
        System.out.println("Random generated otp : " + randomOtp);
        return randomOtp;
    }

    public static long getRemainingResendTime(LocalDateTime otpSentTime) {
        long elapsedSeconds =
                Duration.between(otpSentTime, LocalDateTime.now()).getSeconds();

        long remaining = 30 - elapsedSeconds;
        return Math.max(remaining, 0);
    }
}

package com.xworkz.rashmi_xworkzmodule.service;

public interface EmailService {
    boolean sendSimpleMessage(String email, String subject, String text);
}

package com.xworkz.jobportalapp.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_table")
public class UserDTO {

    @Id
    @Column(name = "user_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "experienced")
    private String experienced;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "last_working_date")
    private String lastWorkingDate;
    @Column(name = "certification_name")
    private String certificationName;
    @Column(name = "issuing_organization")
    private String issuingOrganization;
    @Column(name = "professional_summary")
    private String professionalSummary;
    @Column(name = "primary_skills")
    private String primarySkills;
    @Column(name = "skill_level")
    private String skillLevel;

}

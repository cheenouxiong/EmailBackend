package com.example.demoApps.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Data
public class ApplyFormModel {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String position;
	private String levelOfEduction;
	private String school;
	private String course;
	private String completedEducation;
	private String companyName1;
	private String workTime1;
	private String companyName2;
	private String worktime2;
	private String companyName3;
	private String workTime3;
	private String websiteUrl;
	private MultipartFile file1;
	private MultipartFile file2;
}

package com.htc.assignment1;

import java.util.Date;

public class batch {
	int batchCode;
	Date startDate,endDate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee T1 = new Trainee();
		T1.getTrainee();
		T1.getTraineeName();
		T1.getAge();
		T1.getContactNo();
		T1.getEmailID();
		T1.getGender();	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}

package com.entity;

public class Doctor {
	
	private String Doctor_ID;
	private String doc_Name ;
	private String Specilization;
	private Long PhoneNum;

	
	
	public Doctor(String doctor_ID, String doc_Name, String specilization, Long phoneNum) {
		super();
		this.Doctor_ID = doctor_ID;
		this.doc_Name = doc_Name;
		Specilization = specilization;
		PhoneNum = phoneNum;
	}


	public Doctor() {
		super();
		
	}


	public String getDoctor_ID() {
		return Doctor_ID;
	}


	public void setDoctor_ID(String doctor_ID) {
		this.Doctor_ID = doctor_ID;
	}


	public String getDoc_Name() {
		return doc_Name;
	}


	public void setDoc_Name(String doc_Name) {
		this.doc_Name = doc_Name;
	}


	public String getSpecilization() {
		return Specilization;
	}


	public void setSpecilization(String specilization) {
		Specilization = specilization;
	}


	public Long getPhoneNum() {
		return PhoneNum;
	}


	public void setPhoneNum(long phoneNum) {
		PhoneNum = phoneNum;
	}


	public String toString() {
		return "Host [doctor_ID=" + Doctor_ID + ", doc_Name=" + doc_Name + ", Specilization=" + Specilization
				+ ", PhoneNum=" + PhoneNum + "]";
	}
	
	
	
	
	
}

package com.entity;

public class patient {
//patient_id, patient_name, patient_age, Gender
	private int patient_id;
	private String patient_name;
	private int age;
	private String  Gender;
	private String doctor_ID;
	private String phoneno;
	
	public patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public patient(int patient_id, String patient_name, int age, String gender, String doctor_ID, String phoneno) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.age = age;
		Gender = gender;
		this.doctor_ID = doctor_ID;
		this.phoneno = phoneno;
	}




	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	public String getDoctor_ID() {
		return doctor_ID;
	}


	public void setDoctor_ID(String string) {
		this.doctor_ID = string;
	}




	public String getPhoneno() {
		return phoneno;
	}




	public void setPhoneno(String string) {
		this.phoneno = string;
	}




	@Override
	public String toString() {
		return "patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", age=" + age + ", Gender="
				+ Gender + ", doctor_ID=" + doctor_ID + ", phoneno=" + phoneno + "]";
	}
	
	
}

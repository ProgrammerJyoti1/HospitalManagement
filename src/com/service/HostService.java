package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.entity.Doctor;
import com.entity.patient;
import com.management.Hospital_Implementation;

public class HostService {
	

	public void displayAll1() throws ClassNotFoundException, SQLException {
		List<patient> list = new Hospital_Implementation().displayAll1();
		for( patient i :list ) {
			System.out.println(i);
		  }
		}
	
	public void displayAll() throws ClassNotFoundException, SQLException {
		List<Doctor> list1 = new Hospital_Implementation().displayAll();
		for( Doctor i1 :list1 ) {
			System.out.println(i1);
		  }
		}

	public void insertData() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter patient Id:");
		int patient_id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter patient name:");
		String patient_name = sc.nextLine();
		System.out.println("Enter patient age");
		int age = sc.nextInt();
		System.out.println("Enter Gender");
		String Gender = sc.next();
		System.out.println("Enter Contact Num");
		String phoneno =  sc.next();
		System.out.println("Enter Doctor ID");
		String Doctor_ID = sc.next();
		
		patient i = new patient();
		i.setPatient_id(patient_id);
		i.setPatient_name(patient_name);
		i.setAge(age);
		i.setGender(Gender);
		i.setPhoneno(phoneno);
		i.setDoctor_ID(Doctor_ID);
		
		new Hospital_Implementation().insertNewPatient(i);
		
	}

	public void updateData() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter patient Id:");
		int patient_id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter patient name:");
		String patient_name = sc.nextLine();
		System.out.println("Enter patient age");
		int age = sc.nextInt();
		System.out.println("Enter Gender");
		String Gender = sc.next();
		System.out.println("Enter Contact Num");
		String phoneno =  sc.next();
		System.out.println("Enter Doctor ID");
		String Doctor_ID = sc.next();
		
		patient i = new patient();
		i.setPatient_id(patient_id);
		i.setPatient_name(patient_name);
		i.setAge(age);
		i.setGender(Gender);
		i.setPhoneno(phoneno);
		i.setDoctor_ID(Doctor_ID);
		
		new Hospital_Implementation().updateNewPatient(i);
		}

	public void DeleteData() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the patient id");
		int patient_id=sc.nextInt();
		patient i = new patient();
		
	
		i.setPatient_id(patient_id);
		new Hospital_Implementation().deletePatient(i);
		
		
	}

	

}

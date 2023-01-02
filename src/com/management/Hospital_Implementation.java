package com.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;
import com.entity.patient;

public class Hospital_Implementation implements Hospital {

	public List<patient> displayAll1() throws ClassNotFoundException, SQLException {
		ArrayList<patient> list = new ArrayList<patient>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch", "root", "admin");
		PreparedStatement st = con.prepareStatement("select * from  PatientRecords");
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			patient i = new patient();
			i.setPatient_id(rs.getInt(1));
			i.setPatient_name(rs.getString(2));
			i.setAge(rs.getInt(3));
			i.setGender(rs.getString(4));
			i.setDoctor_ID(rs.getString(5));
			i.setPhoneno(rs.getString(6));
			list.add(i);
			
		}
	
		return list;
	
	
	}

	public List<Doctor> displayAll() throws ClassNotFoundException, SQLException {	
		ArrayList<Doctor> list1 = new ArrayList<Doctor>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch", "root", "admin");
		PreparedStatement st = con.prepareStatement("SELECT * FROM  Doctors");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			Doctor i1 = new Doctor();
			i1.setDoctor_ID(rs.getString(1));
			i1.setDoc_Name(rs.getString(2));
			i1.setSpecilization(rs.getString(3));
			i1.setPhoneNum(rs.getLong(4));
			list1.add(i1);
		}
		
		return list1;
	}

	public void insertNewPatient(patient i) throws ClassNotFoundException, SQLException {
	//	int row=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch", "root", "admin");
		PreparedStatement st = con.prepareStatement("insert into PatientRecords(patient_id, patient_name, Gender, patient_age, phoneno, doctor_ID) values(?,?,?,?,?,?)");
		
		st.setInt(1, i.getPatient_id());
		st.setString(2, i.getPatient_name());
		st.setString(3, i.getGender());
		st.setInt(4, i.getAge());
		st.setString(5, i.getPhoneno());
		st.setString(6, i.getDoctor_ID());
		
		st.executeUpdate();
		
		    System.out.println("insert success");
		
	}

	public void updateNewPatient(patient i) throws ClassNotFoundException, SQLException {
		//int row=0;
		Class.forName("com.mysql.jdbc.Driver");//load the diver
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch","root","admin");//connection
		    PreparedStatement st=con.prepareStatement("update PatientRecords set  patient_name=? , patient_age=?, phoneno=?, Gender=? , doctor_ID=? WHERE patient_id=? ");
		   

			st.setInt(1, i.getPatient_id());
			st.setString(2, i.getPatient_name());
			st.setString(3, i.getGender());
			st.setInt(4, i.getAge());
			st.setString(5, i.getPhoneno());
			st.setString(6, i.getDoctor_ID());
			
			st.executeUpdate();
		    System.out.println("update success");		
		    
	}

	public void deletePatient(patient i) throws ClassNotFoundException, SQLException{
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exlbatch", "root", "admin");
		PreparedStatement st = con.prepareStatement("delete from PatientRecords where patient_id=?");
		st.setInt(1,  i.getPatient_id());
		st.executeUpdate();
		System.out.println("Deleted records sucessfully");
		
	}
}

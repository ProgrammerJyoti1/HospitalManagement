package com.management;

import java.sql.SQLException;
import java.util.List;
import com.entity.Doctor;
import com.entity.patient;


public interface Hospital {
	public List<patient> displayAll1() throws ClassNotFoundException, SQLException;
	public List<Doctor> displayAll() throws ClassNotFoundException, SQLException;
	public void insertNewPatient(patient i) throws ClassNotFoundException, SQLException;	
	public void updateNewPatient(patient i) throws ClassNotFoundException, SQLException;
	public void deletePatient(patient i) throws ClassNotFoundException, SQLException;
	
}

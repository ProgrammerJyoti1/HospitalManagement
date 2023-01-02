use exlbatch;

drop table  Doctors;
drop table PatientRecords;
create table Doctors(doctor_ID varchar(255) primary key, doc_Name varchar(255), Specilization varchar(255), PhoneNum varchar(10));
insert into Doctors(doctor_ID, doc_Name, Specilization, PhoneNum) values('H001', "Thakur Doctor", "Operation" , 9847372839), ('H002', "shivani", "gynecologist" , 9848473739),('H003', "Dhru", "Cardiologist" , 9848473739),('H004', "Mohak", "Neurologist" , 9654473739);
create table PatientRecords(patient_id int primary key, patient_name varchar(255) , patient_age int, Gender varchar(255), doctor_ID varchar(255) );
insert into PatientRecords(patient_id, patient_name, patient_age, Gender) values(1, 'Sunita', 15, 'Female'),(2, 'Amit', 15, 'male');
alter table PatientRecords add  foreign key(doctor_ID) references Doctors(doctor_ID);
alter table patientRecords add column Phoneno int;
update PatientRecords set doctor_ID = 'H001' where patient_id = 1;
update PatientRecords set doctor_ID = 'H003' where patient_id = 2;
update PatientRecords set phoneno = 768676867 where patient_id = 1;
update PatientRecords set phoneno = 946456456 where patient_id = 5;

select * from Doctors;
select * from PatientRecords;
desc Doctors;
desc PatientRecords;
 
 insert into PatientRecords(patient_id, patient_name, patient_age, Gender) values(3, 'rita', 15, 'Female'),(4, 'mita', 55, 'male');
update PatientRecords set  patient_name='Rita', patient_age=66, phoneno=656456557, Gender='Female', doctor_ID='H002' where patient_id=3;
update PatientRecords set doctor_ID=H002 where patient_id = 2;
alter table PatientRecords modify column phoneno varchar(255)  ;
delete from patient where patient_id=4;






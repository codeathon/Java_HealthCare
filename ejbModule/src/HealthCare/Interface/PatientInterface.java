/**
 * 
 */
package src.HealthCare.Interface;

import java.sql.Date;

/**
 * @author rohit
 *
 */
public interface PatientInterface {
	public void getPatientInfo(int id);
	public void addPatient(String fName, String mName, String lName , String fatherName, String motherName,int age, Date dob, String add1, String add2, String add3,char sex, long cellNum);
	public void deletePatientInfo(int id);
	public void updatePatientInfo(int id);
}

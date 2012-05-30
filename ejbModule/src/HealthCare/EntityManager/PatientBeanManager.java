/**
 * 
 */
package src.HealthCare.EntityManager;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import src.HealthCare.Interface.PatientInterface;

/**
 * @author rohit
 *
 */
public class PatientBeanManager implements Serializable, PatientInterface{
	@PersistenceContext(unitName="entityBean")
	EntityManager em;
	/**
	 * 
	 */
	public PatientBeanManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPatientInfo(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPatient(String fName, String mName, String lName,
			String fatherName, String motherName, int age, Date dob,
			String add1, String add2, String add3, char sex, long cellNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePatientInfo(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePatientInfo(int id) {
		// TODO Auto-generated method stub
		
	}

}

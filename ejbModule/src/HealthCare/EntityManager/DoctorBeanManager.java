/**
 * 
 */
package src.HealthCare.EntityManager;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import src.HealthCare.EntityBean.DoctorBean;
import src.HealthCare.Interface.DoctorInterface;

/**
 * @author rohit
 *
 */
@SuppressWarnings("serial")
public class DoctorBeanManager implements Serializable,DoctorInterface{
	@PersistenceContext(unitName="entityBean")
	EntityManager em;
	
	@Override
	public void getDoctorInfo(int id) {
		if(id < 0) {
			throw new ArithmeticException("Id cannot be negative");
		}
		em.createNamedQuery("SELECT * FROM Doctor where id=?1");
		
	}

	@Override
	public void addDoctor(String doctorFirstName, String doctorMName,
			String doctorLastName, String doctorFatherName,
			String doctorMotherName, char doctorSex, long doctorPrivateCellNum,
			long doctorHospitalNum, int doctorAge, Date doctorDateOfBirth,
			String doctorSpeciality, String doctorDaysOfWork,
			int doctorHoursOfWork) {
		// TODO Auto-generated method stub
		
		DoctorBean DB = new DoctorBean( doctorFirstName,  doctorMName,
			 doctorLastName,  doctorFatherName,
			 doctorMotherName,  doctorSex,  doctorPrivateCellNum,
			 doctorHospitalNum,  doctorAge,  doctorDateOfBirth,
			 doctorSpeciality,  doctorDaysOfWork,
			 doctorHoursOfWork);
		
		em.persist(DB);
		
	}

	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		em.createNamedQuery("DELETE FROM Patient where id=?1");
		
	}

	@Override
	public void updateDoctorInfo(int id) {
		// TODO Auto-generated method stub
		
		
	}

}

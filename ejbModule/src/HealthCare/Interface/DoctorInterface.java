/**
 * 
 */
package src.HealthCare.Interface;

import java.sql.Date;

/**
 * @author rohit
 *
 */
public interface DoctorInterface {
	public void getDoctorInfo(int id);
	public void addDoctor(String doctorFirstName, String doctorMName,
			String doctorLastName, String doctorFatherName,
			String doctorMotherName, char doctorSex, long doctorPrivateCellNum,
			long doctorHospitalNum, int doctorAge, Date doctorDateOfBirth,
			String doctorSpeciality, String doctorDaysOfWork,
			int doctorHoursOfWork);
	public void deleteDoctor(int id);
	public void updateDoctorInfo(int id);
}

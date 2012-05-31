/**
 * 
 */
package src.HealthCare.EntityBean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author rohit
 *
 */
@Entity
@Table(name="Doctor")
@SequenceGenerator(name="DoctorSequence", sequenceName="DoctorIDSequence")
public class DoctorBean {
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int doctorID;
	
	private String doctorFirstName;
	private String doctorMName;
	private String doctorLastName;
	private String doctorFatherName;
	private String doctorMotherName;
	
	private char doctorSex;
	
	private long doctorPrivateCellNum;
	
	private long doctorHospitalNum;
	
	private int doctorAge;
	
	private Date doctorDateOfBirth;
	
	/**
	 * @param doctorFirstName
	 * @param doctorMName
	 * @param doctorLastName
	 * @param doctorFatherName
	 * @param doctorMotherName
	 * @param doctorSex
	 * @param doctorPrivateCellNum
	 * @param doctorHospitalNum
	 * @param doctorAge
	 * @param doctorDateOfBirth
	 * @param doctorSpeciality
	 * @param doctorDaysOfWork
	 * @param doctorHoursOfWork
	 */
	public DoctorBean(String doctorFirstName, String doctorMName,
			String doctorLastName, String doctorFatherName,
			String doctorMotherName, char doctorSex, long doctorPrivateCellNum,
			long doctorHospitalNum, int doctorAge, Date doctorDateOfBirth,
			String doctorSpeciality, String doctorDaysOfWork,
			int doctorHoursOfWork) {
		super();
		this.doctorFirstName = doctorFirstName;
		this.doctorMName = doctorMName;
		this.doctorLastName = doctorLastName;
		this.doctorFatherName = doctorFatherName;
		this.doctorMotherName = doctorMotherName;
		this.doctorSex = doctorSex;
		this.doctorPrivateCellNum = doctorPrivateCellNum;
		this.doctorHospitalNum = doctorHospitalNum;
		this.doctorAge = doctorAge;
		this.doctorDateOfBirth = doctorDateOfBirth;
		this.doctorSpeciality = doctorSpeciality;
		this.doctorDaysOfWork = doctorDaysOfWork;
		this.doctorHoursOfWork = doctorHoursOfWork;
	}

	private String doctorSpeciality;
	
	private String doctorDaysOfWork;
	
	private int doctorHoursOfWork;
	
	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorFirstName() {
		return doctorFirstName;
	}

	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}

	public String getDoctorMName() {
		return doctorMName;
	}

	public void setDoctorMName(String doctorMName) {
		this.doctorMName = doctorMName;
	}

	public String getDoctorLastName() {
		return doctorLastName;
	}

	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}

	public String getDoctorFatherName() {
		return doctorFatherName;
	}

	public void setDoctorFatherName(String doctorFatherName) {
		this.doctorFatherName = doctorFatherName;
	}

	public String getDoctorMotherName() {
		return doctorMotherName;
	}

	public void setDoctorMotherName(String doctorMotherName) {
		this.doctorMotherName = doctorMotherName;
	}

	public char getDoctorSex() {
		return doctorSex;
	}

	public void setDoctorSex(char doctorSex) {
		this.doctorSex = doctorSex;
	}

	public long getDoctorPrivateCellNum() {
		return doctorPrivateCellNum;
	}

	public void setDoctorPrivateCellNum(long doctorPrivateCellNum) {
		this.doctorPrivateCellNum = doctorPrivateCellNum;
	}

	public long getDoctorHospitalNum() {
		return doctorHospitalNum;
	}

	public void setDoctorHospitalNum(long doctorHospitalNum) {
		this.doctorHospitalNum = doctorHospitalNum;
	}

	public int getDoctorAge() {
		return doctorAge;
	}

	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}

	public Date getDoctorDateOfBirth() {
		return doctorDateOfBirth;
	}

	public void setDoctorDateOfBirth(Date doctorDateOfBirth) {
		this.doctorDateOfBirth = doctorDateOfBirth;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	public String getDoctorDaysOfWork() {
		return doctorDaysOfWork;
	}

	public void setDoctorDaysOfWork(String doctorDaysOfWork) {
		this.doctorDaysOfWork = doctorDaysOfWork;
	}

	public int getDoctorHoursOfWork() {
		return doctorHoursOfWork;
	}

	public void setDoctorHoursOfWork(int doctorHoursOfWork) {
		this.doctorHoursOfWork = doctorHoursOfWork;
	}

	public DoctorBean() {
		// TODO Auto-generated constructor stub
	}

}

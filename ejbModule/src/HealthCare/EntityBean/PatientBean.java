/**
 * 
 */
package src.HealthCare.EntityBean;

import java.io.Serializable;
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
@Table(name="PatientData")
@SequenceGenerator(name="PatientSequence", sequenceName="PatientIDSequence")
public class PatientBean implements Serializable {
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patientId;

	private String patientFirstName;	
	private String patientMiddleName;	
	private String patientLastName;	
	private String patientFatherName;	
	private String patientMotherName;
	
	private int patientAge;
	private Date patientDateOfBirth;
	
	private String patientAddressLine1;
	private String patientAddressLine2;
	private String patientAddressLine3;
	
	private char patientSex;
	
	private long patientContactNumber;
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientMiddleName() {
		return patientMiddleName;
	}

	public void setPatientMiddleName(String patientMiddleName) {
		this.patientMiddleName = patientMiddleName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientFatherName() {
		return patientFatherName;
	}

	public void setPatientFatherName(String patientFatherName) {
		this.patientFatherName = patientFatherName;
	}

	public String getPatientMotherName() {
		return patientMotherName;
	}

	public void setPatientMotherName(String patientMotherName) {
		this.patientMotherName = patientMotherName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public Date getPatientDateOfBirth() {
		return patientDateOfBirth;
	}

	public void setPatientDateOfBirth(Date patientDateOfBirth) {
		this.patientDateOfBirth = patientDateOfBirth;
	}

	public String getPatientAddressLine1() {
		return patientAddressLine1;
	}

	public void setPatientAddressLine1(String patientAddressLine1) {
		this.patientAddressLine1 = patientAddressLine1;
	}

	public String getPatientAddressLine2() {
		return patientAddressLine2;
	}

	public void setPatientAddressLine2(String patientAddressLine2) {
		this.patientAddressLine2 = patientAddressLine2;
	}

	public String getPatientAddressLine3() {
		return patientAddressLine3;
	}

	public void setPatientAddressLine3(String patientAddressLine3) {
		this.patientAddressLine3 = patientAddressLine3;
	}

	public char getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(char patientSex) {
		this.patientSex = patientSex;
	}

	public long getPatientContactNumber() {
		return patientContactNumber;
	}

	public void setPatientContactNumber(long patientContactNumber) {
		this.patientContactNumber = patientContactNumber;
	}

	/**
	 * 
	 */
	public PatientBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}

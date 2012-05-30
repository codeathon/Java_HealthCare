/**
 * 
 */
package src.HealthCare.EntityBean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rohit
 *
 */
@Entity
public class PatientBean {
	@Id
	private int patientId;

	/**
	 * 
	 */
	public PatientBean() {
		// TODO Auto-generated constructor stub
	}

}

package be.famifed.dibiss;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MonoParentalSituationTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date startDate;
	
	private Date endDate;
	
	private boolean monoParental;
	
	private boolean monoParentalSupplement;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isMonoParental() {
		return monoParental;
	}

	public void setMonoParental(boolean monoParental) {
		this.monoParental = monoParental;
	}

	public boolean isMonoParentalSupplement() {
		return monoParentalSupplement;
	}

	public void setMonoParentalSupplement(boolean monoParentalSupplement) {
		this.monoParentalSupplement = monoParentalSupplement;
	}
	
	
}

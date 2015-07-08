package be.famifed.dibiss;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MonthTO {
	
	@Column(name = "MONTH_MONTH")
	private int month;
	@Column(name = "MONTH_YEAR")
	private int year;
	
	@SuppressWarnings("unused")
	private MonthTO(){
		
	}
	
	public MonthTO(int month, int year) {
		super();
		this.month = month;
		this.year = year;
	}
	
	
	
}

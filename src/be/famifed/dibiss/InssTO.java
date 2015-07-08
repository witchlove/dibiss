package be.famifed.dibiss;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InssTO {
	
	@Column(name = "INSS")
	private String value;

	@SuppressWarnings(value = { "unused" })
	private InssTO(){
		
	}
	
	public InssTO(String value) {
		super();
		this.value = value;
	}
	
	
}

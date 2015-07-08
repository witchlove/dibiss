package be.famifed.dibiss;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class BeneficiaryTO extends ActorTO {
	 
	@OneToOne(cascade = CascadeType.ALL)
	private PaymentMethodTO paymentMethodTO;
	
	public BeneficiaryTO(){
		
	}
	
	public BeneficiaryTO(String fileReference) {
		super(fileReference);
	}

	public PaymentMethodTO getPaymentMethodTO() {
		return paymentMethodTO;
	}

	public void setPaymentMethodTO(PaymentMethodTO paymentMethodTO) {
		this.paymentMethodTO = paymentMethodTO;
	}
	
	
	
}

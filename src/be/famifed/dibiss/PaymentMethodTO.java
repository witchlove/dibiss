package be.famifed.dibiss;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.PaymentMethodTOType;

@Entity
public class PaymentMethodTO{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private PaymentMethodTOType paymentMethodTOType;
	
	private String bankName;
	
	private String iban;
	
	private String bic;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressTO address;
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

	public PaymentMethodTOType getPaymentMethodTOType() {
		return paymentMethodTOType;
	}

	public void setPaymentMethodTOType(PaymentMethodTOType paymentMethodTOType) {
		this.paymentMethodTOType = paymentMethodTOType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public AddressTO getAddress() {
		return address;
	}

	public void setAddress(AddressTO address) {
		this.address = address;
	}
}

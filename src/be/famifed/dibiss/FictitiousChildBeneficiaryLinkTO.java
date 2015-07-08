package be.famifed.dibiss;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import be.famifed.dibiss.enums.AcquisitionScale;
import be.famifed.dibiss.enums.Regime;

@Entity
@Table(name = "FIC_CHILD_BENE_LINK")
public class FictitiousChildBeneficiaryLinkTO {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	
	@Embedded
    private InssTO benefitReceiver;

    private boolean oneThirdNaturalPerson;
    
    private boolean oneParentFamily;
    
    @Enumerated(EnumType.STRING)
    private Regime regime;
    
    @Enumerated(EnumType.STRING)
    private AcquisitionScale acquisitionScale;
    
    @OneToOne(cascade = CascadeType.ALL)
    private FundTO fund;
    
    private String reference;

	public InssTO getBenefitReceiver() {
		return benefitReceiver;
	}

	public void setBenefitReceiver(InssTO benefitReceiver) {
		this.benefitReceiver = benefitReceiver;
	}

	public boolean isOneThirdNaturalPerson() {
		return oneThirdNaturalPerson;
	}

	public void setOneThirdNaturalPerson(boolean oneThirdNaturalPerson) {
		this.oneThirdNaturalPerson = oneThirdNaturalPerson;
	}

	public boolean isOneParentFamily() {
		return oneParentFamily;
	}

	public void setOneParentFamily(boolean oneParentFamily) {
		this.oneParentFamily = oneParentFamily;
	}

	public Regime getRegime() {
		return regime;
	}

	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	public AcquisitionScale getAcquisitionScale() {
		return acquisitionScale;
	}

	public void setAcquisitionScale(AcquisitionScale acquisitionScale) {
		this.acquisitionScale = acquisitionScale;
	}

	public FundTO getFund() {
		return fund;
	}

	public void setFund(FundTO fund) {
		this.fund = fund;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
}

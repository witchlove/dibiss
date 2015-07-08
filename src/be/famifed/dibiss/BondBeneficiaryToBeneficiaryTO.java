package be.famifed.dibiss;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.BeneficiaryBond;

@Entity
@Table(name="BOND_BENE_2_BENE")
public class BondBeneficiaryToBeneficiaryTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Embedded
	@AttributeOverrides({
		    @AttributeOverride(name="value", column= @Column(name="FROM_INSS")),
		  })
	private InssTO fromBeneficiary;
    
	@Embedded
	@AttributeOverrides({
		    @AttributeOverride(name="value", column= @Column(name="TO_INSS")),
		  })
	private InssTO toBeneficiary;
    
	@Enumerated(EnumType.STRING)
    private BeneficiaryBond beneficiaryBond;
	
	
	public InssTO getFromBeneficiary() {
		return fromBeneficiary;
	}

	public void setFromBeneficiary(InssTO fromBeneficiary) {
		this.fromBeneficiary = fromBeneficiary;
	}

	public InssTO getToBeneficiary() {
		return toBeneficiary;
	}

	public void setToBeneficiary(InssTO toBeneficiary) {
		this.toBeneficiary = toBeneficiary;
	}

	public BeneficiaryBond getBeneficiaryBond() {
		return beneficiaryBond;
	}

	public void setBeneficiaryBond(BeneficiaryBond beneficiaryBond) {
		this.beneficiaryBond = beneficiaryBond;
	}
    
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
    
}

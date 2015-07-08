package be.famifed.dibiss;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.PlacedInFosterHomeType;

@Entity
public class ChildFosterHomeLinkTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Embedded
	private InssTO lumpsumBeneficiaryInss;
	
	@Enumerated
	private PlacedInFosterHomeType placementType;
		
	private String callName;

	public InssTO getLumpsumBeneficiaryInss() {
		return lumpsumBeneficiaryInss;
	}

	public void setLumpsumBeneficiaryInss(InssTO lumpsumBeneficiaryInss) {
		this.lumpsumBeneficiaryInss = lumpsumBeneficiaryInss;
	}

	public PlacedInFosterHomeType getPlacementType() {
		return placementType;
	}

	public void setPlacementType(PlacedInFosterHomeType placementType) {
		this.placementType = placementType;
	}

	public String getCallName() {
		return callName;
	}

	public void setCallName(String callName) {
		this.callName = callName;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
	
}

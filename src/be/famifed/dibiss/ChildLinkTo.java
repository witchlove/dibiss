package be.famifed.dibiss;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.AcquisitionScale;

@MappedSuperclass
public class ChildLinkTo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private InssTO beneficiaryInss;
	
	private AcquisitionScale scale;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AssimilationTO assimilationTO;
	
	public InssTO getBeneficiaryInss() {
		return beneficiaryInss;
	}
	public void setBeneficiaryInss(InssTO beneficiaryInss) {
		this.beneficiaryInss = beneficiaryInss;
	}
	public AcquisitionScale getScale() {
		return scale;
	}
	public void setScale(AcquisitionScale scale) {
		this.scale = scale;
	}
	public AssimilationTO getAssimilationTO() {
		return assimilationTO;
	}
	public void setAssimilationTO(AssimilationTO assimilationTO) {
		this.assimilationTO = assimilationTO;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
	
}

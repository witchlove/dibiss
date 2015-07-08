package be.famifed.dibiss;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "FICTITIOUS_CHILD_TO_ID"))
public class FictitiousChildTO extends ActorTO {
	
	protected FictitiousChildTO(){
		
	}
	
	public FictitiousChildTO(String fileReference){
		super(fileReference);
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FK_FIC_BERT")
	private FictitiousChildBeneficiaryLinkTO fictitiousChildBeneficiaryLinkTO;

	public FictitiousChildBeneficiaryLinkTO getFictitiousChildBeneficiaryLinkTO() {
		return fictitiousChildBeneficiaryLinkTO;
	}

	public void setFictitiousChildBeneficiaryLinkTO(FictitiousChildBeneficiaryLinkTO fictitiousChildBeneficiaryLinkTO) {
		this.fictitiousChildBeneficiaryLinkTO = fictitiousChildBeneficiaryLinkTO;
	}
 
	
	
}

package be.famifed.dibiss;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class ChildTo extends ActorTO{

	@Column(name= "FILE_REFERENCE")
	private String fileReference;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ChildLegalSituationTO childLegalSituation;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MonoParentalSituationTO monoParentalSituation;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ChildBeneficiaryLinkTO> childBeneficiaryLinks;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ChildInstitutionLinkTO> childInstitutionLinks;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ChildFosterHomeLinkTO> childFosterHomeLinks;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<BondActorTO> bondActors;
    
    
    private Date youngJobSeekerInscriptionDate;

	
	public String getFileReference() {
		return fileReference;
	}

	public ChildLegalSituationTO getChildLegalSituation() {
		return childLegalSituation;
	}

	public void setChildLegalSituation(ChildLegalSituationTO childLegalSituation) {
		this.childLegalSituation = childLegalSituation;
	}

	public Date getYoungJobSeekerInscriptionDate() {
		return youngJobSeekerInscriptionDate;
	}

	public void setYoungJobSeekerInscriptionDate(Date youngJobSeekerInscriptionDate) {
		this.youngJobSeekerInscriptionDate = youngJobSeekerInscriptionDate;
	}

	@SuppressWarnings("unused")
	private ChildTo(){
		
	}
	
	public ChildTo(String fileRefernece) {
		fileReference = fileRefernece;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

	public MonoParentalSituationTO getMonoParentalSituation() {
		return monoParentalSituation;
	}

	public void setMonoParentalSituation(MonoParentalSituationTO monoParentalSituation) {
		this.monoParentalSituation = monoParentalSituation;
	}

	public List<ChildBeneficiaryLinkTO> getChildBeneficiaryLinks() {
		return childBeneficiaryLinks;
	}

	public void setChildBeneficiaryLinks(List<ChildBeneficiaryLinkTO> childBeneficiaryLinks) {
		this.childBeneficiaryLinks = childBeneficiaryLinks;
	}

	public List<ChildInstitutionLinkTO> getChildInstitutionLinks() {
		return childInstitutionLinks;
	}

	public void setChildInstitutionLinks(List<ChildInstitutionLinkTO> childInstitutionLinks) {
		this.childInstitutionLinks = childInstitutionLinks;
	}

	public List<ChildFosterHomeLinkTO> getChildFosterHomeLinks() {
		return childFosterHomeLinks;
	}

	public void setChildFosterHomeLinks(List<ChildFosterHomeLinkTO> childFosterHomeLinks) {
		this.childFosterHomeLinks = childFosterHomeLinks;
	}

	public List<BondActorTO> getBondActors() {
		return bondActors;
	}

	public void setBondActors(List<BondActorTO> bondActors) {
		this.bondActors = bondActors;
	}
}

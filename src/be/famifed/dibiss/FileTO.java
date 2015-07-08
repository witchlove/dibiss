package be.famifed.dibiss;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.Language;

/**
 * Entity implementation class for Entity: FileTO
 *
 */
@Entity
public class FileTO implements Serializable {

	@Id
	private String fileReference;
	
	@Enumerated(EnumType.STRING)
	private Language language;

	@OneToOne(cascade = CascadeType.ALL)
	private FileOnwerTO fileOwner;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FILE_REFERENCE")
	private List<BeneficiaryTO> beneficiaries;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FILE_REFERENCE")
	private List<ChildTo> children;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FILE_REFERENCE")
	private List<FictitiousChildTO> fictitiousChildren;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FILE_REFERENCE")
	private List<FourthActorTO> fourthActors;
   
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "FILE_REFERENCE")
    private List<BondBeneficiaryToBeneficiaryTO> bondBeneficiaryToBeneficiary;
	
	@Embedded
	private MonthTO acquisitionMonth;
	
	@Column(name = "SOCIAL_FUND")
	private String socialFund;
	
	private String various;
	

	public FileOnwerTO getFileOwner() {
		return fileOwner;
	}

	public List<ChildTo> getChildren() {
		return children;
	}

	private static final long serialVersionUID = 1L;

	public FileTO() {
		super();
	}
	
	public FileTO(String fileReference, Language language){
		this.fileReference = fileReference;
		this.language = language;
		
		
	}
	
	public String getFileReference() {
		return this.fileReference;
	}

	public void setFileReference(String fileReference) {
		this.fileReference = fileReference;
	}
    
	public void addChildTo(ChildTo childTo){
		if(children == null){
			children = new ArrayList<ChildTo>();
		}
		
		children.add(childTo);
	}
	
	public void addBeneficiaryTO(BeneficiaryTO beneficiaryTO){
		if(beneficiaries == null){
			beneficiaries = new ArrayList<BeneficiaryTO>();
		}
		
		beneficiaries.add(beneficiaryTO);
	}
	
	public void addFourthActor(FourthActorTO fourthActorTO) {
		if(fourthActors == null){
			fourthActors  = new ArrayList<FourthActorTO>();
		}
		fourthActors.add(fourthActorTO);
	}
	
	public void addFictitiousChildTO(FictitiousChildTO fictitiousChildTO) {
		if(fictitiousChildren == null){
			fictitiousChildren  = new ArrayList<FictitiousChildTO>();
		}
		fictitiousChildren.add(fictitiousChildTO);	
	}
	
	public void addBondBeneficiaryToBeneficiaryTO(BondBeneficiaryToBeneficiaryTO beneficiaryToBeneficiaryTO){
		if(bondBeneficiaryToBeneficiary == null){
			bondBeneficiaryToBeneficiary = new ArrayList<>();
		}
		bondBeneficiaryToBeneficiary.add(beneficiaryToBeneficiaryTO);
	}
	

	public Language getLanguage() {
		return language;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

	public List<BeneficiaryTO> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<BeneficiaryTO> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public List<FictitiousChildTO> getFictitiousChildren() {
		return fictitiousChildren;
	}

	public void setFictitiousChildren(List<FictitiousChildTO> fictitiousChildren) {
		this.fictitiousChildren = fictitiousChildren;
	}

	public List<FourthActorTO> getFourthActors() {
		return fourthActors;
	}

	public void setFourthActors(List<FourthActorTO> fourthActors) {
		this.fourthActors = fourthActors;
	}

	public List<BondBeneficiaryToBeneficiaryTO> getBondBeneficiaryToBeneficiary() {
		return bondBeneficiaryToBeneficiary;
	}

	public void setBondBeneficiaryToBeneficiary(List<BondBeneficiaryToBeneficiaryTO> bondBeneficiaryToBeneficiary) {
		this.bondBeneficiaryToBeneficiary = bondBeneficiaryToBeneficiary;
	}

	public MonthTO getAcquisitionMonth() {
		return acquisitionMonth;
	}

	public void setAcquisitionMonth(MonthTO acquisitionMonth) {
		this.acquisitionMonth = acquisitionMonth;
	}

	public String getSocialFund() {
		return socialFund;
	}

	public void setSocialFund(String socialFund) {
		this.socialFund = socialFund;
	}

	public String getVarious() {
		return various;
	}

	public void setVarious(String various) {
		this.various = various;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void setFileOwner(FileOnwerTO fileOwner) {
		this.fileOwner = fileOwner;
	}

	public void setChildren(List<ChildTo> children) {
		this.children = children;
	}

	
}

package be.famifed.dibiss;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.CommunityType;
import be.famifed.dibiss.enums.PlacedInOrganizationType;

@Entity
public class ChildInstitutionLinkTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String beneficiaryName;
	private String beneficiaryFirstName;
	private String uniqueID;
	private String address;
	private String paymentMethod;
	@Enumerated(EnumType.STRING)
	private PlacedInOrganizationType placedInOrganizationType;
	private String reference;
	private String institutionCallName;
	@Enumerated(EnumType.STRING)
	private CommunityType community;
	private String various;
	private String childCode;
	private String forfait;
	
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryFirstName() {
		return beneficiaryFirstName;
	}
	public void setBeneficiaryFirstName(String beneficiaryFirstName) {
		this.beneficiaryFirstName = beneficiaryFirstName;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public PlacedInOrganizationType getPlacedInOrganizationType() {
		return placedInOrganizationType;
	}
	public void setPlacedInOrganizationType(PlacedInOrganizationType placedInOrganizationType) {
		this.placedInOrganizationType = placedInOrganizationType;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getInstitutionCallName() {
		return institutionCallName;
	}
	public void setInstitutionCallName(String institutionCallName) {
		this.institutionCallName = institutionCallName;
	}
	public CommunityType getCommunity() {
		return community;
	}
	public void setCommunity(CommunityType community) {
		this.community = community;
	}
	public String getVarious() {
		return various;
	}
	public void setVarious(String various) {
		this.various = various;
	}
	public String getChildCode() {
		return childCode;
	}
	public void setChildCode(String childCode) {
		this.childCode = childCode;
	}
	public String getForfait() {
		return forfait;
	}
	public void setForfait(String forfait) {
		this.forfait = forfait;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}

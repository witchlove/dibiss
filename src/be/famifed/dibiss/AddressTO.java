package be.famifed.dibiss;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddressTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String street;
    private Integer streetCode;
    private Integer municipalityNISCode;
    private String houseNr;
    private String postBox;
    private String municipalityName;
    private String postalCode;
    private Integer countryCode;
    
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getStreetCode() {
		return streetCode;
	}
	public void setStreetCode(Integer streetCode) {
		this.streetCode = streetCode;
	}
	public Integer getMunicipalityNISCode() {
		return municipalityNISCode;
	}
	public void setMunicipalityNISCode(Integer municipalityNISCode) {
		this.municipalityNISCode = municipalityNISCode;
	}
	public String getHouseNr() {
		return houseNr;
	}
	public void setHouseNr(String houseNr) {
		this.houseNr = houseNr;
	}
	public String getPostBox() {
		return postBox;
	}
	public void setPostBox(String postBox) {
		this.postBox = postBox;
	}
	public String getMunicipalityName() {
		return municipalityName;
	}
	public void setMunicipalityName(String municipalityName) {
		this.municipalityName = municipalityName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}
    
}

package be.famifed.dibiss;

import static be.famifed.dibiss.enums.ActorRole.CHILD;
import static be.famifed.dibiss.enums.AssimilationType._42_BIS_EX_UNEMPLOYED;
import static be.famifed.dibiss.enums.PlacedInFosterHomeType.P1;
import static com.google.common.collect.Lists.newArrayList;

import java.util.Date;

import be.famifed.dibiss.enums.AcquisitionScale;
import be.famifed.dibiss.enums.ActorRole;
import be.famifed.dibiss.enums.BeneficiaryBond;
import be.famifed.dibiss.enums.BondMotif;
import be.famifed.dibiss.enums.BondType;
import be.famifed.dibiss.enums.CommunityType;
import be.famifed.dibiss.enums.FundType;
import be.famifed.dibiss.enums.Ground;
import be.famifed.dibiss.enums.PaymentMethodTOType;
import be.famifed.dibiss.enums.PlacedInOrganizationType;
import be.famifed.dibiss.enums.Regime;

public class DataGenerator {

	private static final InssTO INSS = new InssTO("74060725564");
	private static final Date FIXED_DATE = new Date();

	public static ChildTo createChildTO(String fileReference) {
		ChildTo child01 = new ChildTo(fileReference);

		BondActorTO bondActor01 = new BondActorTO();
		bondActor01.setActorRole(ActorRole.BENEFICIARY);
		bondActor01.setBondMotif(BondMotif.BENEFICIARY_FAMILY_HEAD_102);
		bondActor01.setBondType(BondType.OTHER);
		bondActor01.setInss(INSS);

		ChildDisNewSysTO newSysTo = new ChildDisNewSysTO();
		newSysTo.setColumn1(1);
		newSysTo.setTotalScale(4);
		newSysTo.setStartDate(new Date());
		newSysTo.setEndDate(new Date());

		ChildDisabilityTO disTO = new ChildDisabilityTO();
		disTO.setNewSystemTOs(newArrayList(newSysTo));

		LegalGroundTO legalGround01 = new LegalGroundTO();
		legalGround01.setGround(Ground.APPRENTICESHIP);
		legalGround01.setRightEndDate(FIXED_DATE);
		legalGround01.setRightSuspensionDate(FIXED_DATE);
		legalGround01.setVarious("VARIOUS");

		ChildLegalSituationTO legalsituation01 = new ChildLegalSituationTO();
		legalsituation01.setChildDisabilityTO(disTO);
		legalsituation01.setJobSeekerRegistrationDate(FIXED_DATE);
		legalsituation01.setLegalGroundTO(legalGround01);

		AssimilationTO assimilationTO01 = createAssimilationT0();

		ChildBeneficiaryLinkTO childBeneficiaryLinkTO = new ChildBeneficiaryLinkTO();
		childBeneficiaryLinkTO.setBeneficiaryInss(INSS);
		childBeneficiaryLinkTO.setAssimilationTO(assimilationTO01);
		childBeneficiaryLinkTO.setScale(AcquisitionScale.REGULAR_SCALE);

		ChildFosterHomeLinkTO childFosterHomeLinkTO = new ChildFosterHomeLinkTO();
		childFosterHomeLinkTO.setCallName("CALL ME BABY");
		childFosterHomeLinkTO.setLumpsumBeneficiaryInss(INSS);
		childFosterHomeLinkTO.setPlacementType(P1);

		ChildInstitutionLinkTO childInstitutionLinkTO = new ChildInstitutionLinkTO();
		childInstitutionLinkTO.setAddress("trierstraat 120 2000 Brussel");
		childInstitutionLinkTO.setBeneficiaryFirstName("FIRSTNAME");
		childInstitutionLinkTO.setBeneficiaryName("NAME");
		childInstitutionLinkTO.setChildCode("CHILDCODE");
		childInstitutionLinkTO.setCommunity(CommunityType.DUTCH);
		childInstitutionLinkTO.setForfait("FORFAIT");
		childInstitutionLinkTO.setInstitutionCallName("CALL NAME INSITUTION");
		childInstitutionLinkTO.setPaymentMethod("IBAN");
		childInstitutionLinkTO.setPlacedInOrganizationType(PlacedInOrganizationType.I2);
		childInstitutionLinkTO.setReference("REFERENCE");
		childInstitutionLinkTO.setUniqueID("UNIEK");
		childInstitutionLinkTO.setVarious("VARIOUS");

		MonoParentalSituationTO monoParentalSituationTO = new MonoParentalSituationTO();
		monoParentalSituationTO.setMonoParental(true);
		monoParentalSituationTO.setMonoParentalSupplement(true);
		monoParentalSituationTO.setStartDate(FIXED_DATE);
		monoParentalSituationTO.setEndDate(FIXED_DATE);

		child01.setActorRole(CHILD);
		child01.setInss(INSS);
		child01.setBondActors(newArrayList(bondActor01));
		child01.setChildLegalSituation(legalsituation01);
		child01.setChildBeneficiaryLinks(newArrayList(childBeneficiaryLinkTO));
		child01.setChildFosterHomeLinks(newArrayList(childFosterHomeLinkTO));
		child01.setChildInstitutionLinks(newArrayList(childInstitutionLinkTO));
		child01.setMonoParentalSituation(monoParentalSituationTO);
		child01.setYoungJobSeekerInscriptionDate(FIXED_DATE);
		return child01;
	}

	public static BeneficiaryTO createBeneficiaryTO(String fileReference) {

		AddressTO addressTO = new AddressTO();
		addressTO.setCountryCode(1);
		addressTO.setHouseNr("1");
		addressTO.setMunicipalityName("GEMEENTE");
		addressTO.setMunicipalityNISCode(15);
		addressTO.setPostalCode("2000");
		addressTO.setPostBox("5");
		addressTO.setStreet("Highway to hell");
		addressTO.setStreetCode(78989);

		PaymentMethodTO paymentMethodTO = new PaymentMethodTO();
		paymentMethodTO.setAddress(addressTO);
		paymentMethodTO.setBankName("KGB Belgie");
		paymentMethodTO.setBic("BIC");
		paymentMethodTO.setIban("IBAN");
		paymentMethodTO.setPaymentMethodTOType(PaymentMethodTOType.SEPA);

		BeneficiaryTO beneficiaryTO = new BeneficiaryTO(fileReference);

		beneficiaryTO.setActorRole(ActorRole.BENEFICIARY);
		beneficiaryTO.setInss(INSS);
		beneficiaryTO.setPaymentMethodTO(paymentMethodTO);

		return beneficiaryTO;
	}
	
	public static FictitiousChildTO createFictitiousChildTO(String fileReference){
		FictitiousChildTO fictitiousChildTO = new FictitiousChildTO(fileReference);
		
		FictitiousChildBeneficiaryLinkTO fictitiousChildBeneficiaryLinkTO = new FictitiousChildBeneficiaryLinkTO();
		
		FundTO fundTO = new FundTO();
		fundTO.setFundCode("Gotham City");
		fundTO.setFundType(FundType.PUBLIC_INSTITUTION);
		
		fictitiousChildBeneficiaryLinkTO.setAcquisitionScale(AcquisitionScale.RAISED_SUPPLEMENT_DISABLED_EMPLOYEE);
		fictitiousChildBeneficiaryLinkTO.setBenefitReceiver(INSS);
		fictitiousChildBeneficiaryLinkTO.setFund(fundTO);
		fictitiousChildBeneficiaryLinkTO.setOneParentFamily(false);
		fictitiousChildBeneficiaryLinkTO.setOneThirdNaturalPerson(true);
		fictitiousChildBeneficiaryLinkTO.setReference("reference");
		fictitiousChildBeneficiaryLinkTO.setRegime(Regime.STATE_PERSONNEL);
		
		fictitiousChildTO.setActorRole(ActorRole.FICTITIOUS_CHILD);
		fictitiousChildTO.setInss(INSS);
		fictitiousChildTO.setFictitiousChildBeneficiaryLinkTO(fictitiousChildBeneficiaryLinkTO);
		
		return fictitiousChildTO;
	}
	
	public static FourthActorTO createFourthActorTO(String fileReference){
		FourthActorTO fourthActorTO = new FourthActorTO(fileReference);
		fourthActorTO.setActorRole(ActorRole.FOURTH_ACTOR);
		fourthActorTO.setInss(INSS);
		
		return fourthActorTO;
	}

	public static AssimilationTO createAssimilationT0() {
		AssimilationTO assimilationTO01 = new AssimilationTO();
		assimilationTO01.setAssimilationType(_42_BIS_EX_UNEMPLOYED);
		assimilationTO01.setStartDate(FIXED_DATE);
		assimilationTO01.setEndDate(FIXED_DATE);

		return assimilationTO01;
	}

	public static BondBeneficiaryToBeneficiaryTO createBondBeneficiaryToBeneficiaryTO() {
		BondBeneficiaryToBeneficiaryTO b2b = new BondBeneficiaryToBeneficiaryTO();
		b2b.setBeneficiaryBond(BeneficiaryBond.FACTO_FAMILY);
		b2b.setFromBeneficiary(INSS);
		b2b.setToBeneficiary(INSS);
		return b2b;
	}

}

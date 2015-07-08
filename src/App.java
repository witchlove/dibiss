

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.persistence.jpa.jpql.Assert;

import be.famifed.dibiss.BeneficiaryTO;
import be.famifed.dibiss.BondBeneficiaryToBeneficiaryTO;
import be.famifed.dibiss.ChildTo;
import be.famifed.dibiss.DataGenerator;
import be.famifed.dibiss.FictitiousChildTO;
import be.famifed.dibiss.FileOnwerTO;
import be.famifed.dibiss.FileTO;
import be.famifed.dibiss.FourthActorTO;
import be.famifed.dibiss.MonthTO;
import be.famifed.dibiss.enums.Language;
import be.famifed.dibiss.enums.WorkerStatus;

public class App {	
	
	private static final String fileReference = "000001";
	private static final String PERSISTENCE_UNIT_NAME = "DibissGenerator";
	private static EntityManagerFactory factory;
	
    public static void main( String[] args ){
    	factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
      
        em.setProperty("packagesToScan", "be.famifed.*");
        
        em.getTransaction().begin();
         
        ChildTo child01 = DataGenerator.createChildTO(fileReference);
        ChildTo child02 = DataGenerator.createChildTO(fileReference);
        ChildTo child03 = DataGenerator.createChildTO(fileReference);
        ChildTo child04 = DataGenerator.createChildTO(fileReference);
        
        BeneficiaryTO bene01 = DataGenerator.createBeneficiaryTO(fileReference);
        BeneficiaryTO bene02 = DataGenerator.createBeneficiaryTO(fileReference);
        
        FileOnwerTO fileOnwerTO = new FileOnwerTO();
        fileOnwerTO.setCbeNumber("123456789");
        fileOnwerTO.setAssimilationTO(DataGenerator.createAssimilationT0());
        fileOnwerTO.setHasTimePrestations(false);
        fileOnwerTO.setWorkerStatus(WorkerStatus.MINISTER);
        
        MonthTO monthTO = new MonthTO(1,2015);
        
        FourthActorTO fourthActorTO = DataGenerator.createFourthActorTO(fileReference);
        FictitiousChildTO fic01 = DataGenerator.createFictitiousChildTO(fileReference);
        BondBeneficiaryToBeneficiaryTO b2b01 = DataGenerator.createBondBeneficiaryToBeneficiaryTO();
        
        FileTO fto1 = new FileTO(fileReference, Language.DUTCH);
       
        fto1.addChildTo(child01);
        fto1.addChildTo(child02);
        fto1.addChildTo(child03);
        fto1.addChildTo(child04);
        
        fto1.addBeneficiaryTO(bene01);
        fto1.addBeneficiaryTO(bene02);
        
        fto1.addFourthActor(fourthActorTO);
        
		fto1.addFictitiousChildTO(fic01);
        
		fto1.addBondBeneficiaryToBeneficiaryTO(b2b01);
		
        fto1.setFileOwner(fileOnwerTO);
        fto1.setAcquisitionMonth(monthTO);
        fto1.setSocialFund("099");
        fto1.setVarious("VARIOUS");	
        em.persist(fto1);
        
        em.flush();
        
        em.getTransaction().commit();
        
        Query query = em.createQuery("SELECT e FROM FileTO e");
        
        @SuppressWarnings("unchecked")
		List<FileTO> list = (List<FileTO>) query.getResultList();
        
        FileTO resultFromDb = list.size() > 0 ? list.get(0) : new FileTO();
        
        Assert.isEqual(fto1,resultFromDb,"aaaaaaaaah");
        
        System.out.println(resultFromDb);
        
    }

	
}

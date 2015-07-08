package be.famifed.dibiss;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import be.famifed.dibiss.enums.WorkerStatus;

@Entity
public class FileOnwerTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private WorkerStatus workerStatus;
	
    private String cbeNumber;
    
    @OneToOne(cascade = CascadeType.ALL)
    private AssimilationTO assimilationTO;
    
    private boolean hasTimePrestations;

	public WorkerStatus getWorkerStatus() {
		return workerStatus;
	}

	public void setWorkerStatus(WorkerStatus workerStatus) {
		this.workerStatus = workerStatus;
	}

	public String getCbeNumber() {
		return cbeNumber;
	}

	public void setCbeNumber(String cbeNumber) {
		this.cbeNumber = cbeNumber;
	}

	public AssimilationTO getAssimilationTO() {
		return assimilationTO;
	}

	public void setAssimilationTO(AssimilationTO assimilationTO) {
		this.assimilationTO = assimilationTO;
	}

	public boolean isHasTimePrestations() {
		return hasTimePrestations;
	}

	public void setHasTimePrestations(boolean hasTimePrestations) {
		this.hasTimePrestations = hasTimePrestations;
	}
	
    
    
	
}

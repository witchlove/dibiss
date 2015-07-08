package be.famifed.dibiss;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class ChildLegalSituationTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LegalGroundTO legalGroundTO;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ChildDisabilityTO childDisabilityTO;
    
    private Date jobSeekerRegistrationDate;
    
    public LegalGroundTO getLegalGroundTO() {
		return legalGroundTO;
	}

	public void setLegalGroundTO(LegalGroundTO legalGroundTO) {
		this.legalGroundTO = legalGroundTO;
	}

	public ChildDisabilityTO getChildDisabilityTO() {
		return childDisabilityTO;
	}

	public void setChildDisabilityTO(ChildDisabilityTO childDisabilityTO) {
		this.childDisabilityTO = childDisabilityTO;
	}

	public Date getJobSeekerRegistrationDate() {
		return jobSeekerRegistrationDate;
	}

	public void setJobSeekerRegistrationDate(Date jobSeekerRegistrationDate) {
		this.jobSeekerRegistrationDate = jobSeekerRegistrationDate;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
	
}

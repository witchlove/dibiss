package be.famifed.dibiss;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
public class ChildDisabilityTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ElementCollection
	private List<ChildDisOldSysTO> OldSystemTOs;
	
	@ElementCollection
	private List<ChildDisNewSysTO> NewSystemTOs;
    
	private boolean handicapBonusPaid;

	public List<ChildDisOldSysTO> getOldSystemTOs() {
		return OldSystemTOs;
	}

	public void setOldSystemTOs(List<ChildDisOldSysTO> oldSystemTOs) {
		OldSystemTOs = oldSystemTOs;
	}

	public List<ChildDisNewSysTO> getNewSystemTOs() {
		return NewSystemTOs;
	}

	public void setNewSystemTOs(List<ChildDisNewSysTO> newSystemTOs) {
		NewSystemTOs = newSystemTOs;
	}

	public boolean isHandicapBonusPaid() {
		return handicapBonusPaid;
	}

	public void setHandicapBonusPaid(boolean handicapBonusPaid) {
		this.handicapBonusPaid = handicapBonusPaid;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
	
}

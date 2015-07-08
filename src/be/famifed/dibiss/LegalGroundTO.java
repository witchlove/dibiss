package be.famifed.dibiss;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.Ground;

@Entity
public class LegalGroundTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private Ground ground;
	
    private String various;
    
    private Date rightEndDate;
    private Date rightSuspensionDate;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

	public Ground getGround() {
		return ground;
	}

	public void setGround(Ground ground) {
		this.ground = ground;
	}

	public String getVarious() {
		return various;
	}

	public void setVarious(String various) {
		this.various = various;
	}

	public Date getRightEndDate() {
		return rightEndDate;
	}

	public void setRightEndDate(Date rightEndDate) {
		this.rightEndDate = rightEndDate;
	}

	public Date getRightSuspensionDate() {
		return rightSuspensionDate;
	}

	public void setRightSuspensionDate(Date rightSuspensionDate) {
		this.rightSuspensionDate = rightSuspensionDate;
	}
	
}

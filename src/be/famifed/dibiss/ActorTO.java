package be.famifed.dibiss;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import be.famifed.dibiss.enums.ActorRole;

@MappedSuperclass
public abstract class ActorTO {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	
	@Embedded
	private InssTO inss;
	
	@Enumerated(EnumType.STRING)
	private ActorRole actorRole;

	@Column(name="FILE_REFERENCE")
	private String fileReference;

	public ActorTO(){
		
	}
	
	protected ActorTO(String fileReference) {
		this.fileReference = fileReference;
		
	}

	public InssTO getInss() {
		return inss;
	}

	public void setInss(InssTO inss) {
		this.inss = inss;
	}

	public ActorRole getActorRole() {
		return actorRole;
	}

	public void setActorRole(ActorRole actorRole) {
		this.actorRole = actorRole;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
	
}

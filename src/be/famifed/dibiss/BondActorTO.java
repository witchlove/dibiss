package be.famifed.dibiss;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import be.famifed.dibiss.enums.ActorRole;
import be.famifed.dibiss.enums.BondMotif;
import be.famifed.dibiss.enums.BondType;
@Entity
public class BondActorTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private InssTO inss;
	
	@Enumerated(EnumType.STRING)
    private BondType bondType;
	
	@Enumerated(EnumType.STRING)
    private BondMotif bondMotif;
	
    @Enumerated(EnumType.STRING)
    private ActorRole actorRole;

	public InssTO getInss() {
		return inss;
	}

	public void setInss(InssTO inss) {
		this.inss = inss;
	}

	public BondType getBondType() {
		return bondType;
	}

	public void setBondType(BondType bondType) {
		this.bondType = bondType;
	}

	public BondMotif getBondMotif() {
		return bondMotif;
	}

	public void setBondMotif(BondMotif bondMotif) {
		this.bondMotif = bondMotif;
	}

	public ActorRole getActorRole() {
		return actorRole;
	}

	public void setActorRole(ActorRole actorRole) {
		this.actorRole = actorRole;
	}
    
    
	
}

package be.famifed.dibiss;

import javax.persistence.Entity;

@Entity
public class FourthActorTO extends ActorTO {
	
	protected FourthActorTO(){
		
	}
	
	public FourthActorTO(String fileReference) {
		super(fileReference);
	}
}

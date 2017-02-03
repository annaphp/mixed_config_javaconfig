package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketGame implements Game{
	
	private Team first;
	private Team second;
	private Team third;
	
	
	
	public CricketGame() {
	}

    @Autowired
	public CricketGame(
		@Qualifier("cows")	Team first, 
		@Qualifier("redSox")	Team second, 
		@Qualifier("redSox")	Team third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	
	public Team getFirst() {
		return first;
	}


	public void setFirst(Team first) {
		this.first = first;
	}


	public Team getSecond() {
		return second;
	}


	public void setSecond(Team second) {
		this.second = second;
	}


	public Team getThird() {
		return third;
	}


	public void setThird(Team third) {
		this.third = third;
	}


	public String playGame() {
		double seed = Math.random();
	   if(seed < 0.33) return first.getName();
	   if(seed >= 0.33 && seed < 0.66) return second.getName();
	   else return third.getName();	
	}

	public void setHomeTeam(Team team) {
		// TODO Auto-generated method stub
		
	}

	public Team getHomeTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAwayTeam(Team team) {
		// TODO Auto-generated method stub
		
	}
	

}

package beans;

public class TeamImplementation implements Team{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TeamImplementation(String name) {
		this.name = name;
	}
	
	public TeamImplementation() {
	}

	@Override
	public String toString() {
		return "TeamImplementation [name=" + name + "]";
	}
	

}

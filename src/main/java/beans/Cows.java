package beans;

import org.springframework.stereotype.Component;


@Component
public class Cows implements Team{

	public String getName() {
		return "cows";
	}

}

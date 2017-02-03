package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Team;
import beans.TeamImplementation;

@Configuration
public class AppConfigSecond {
	
	
	
	@Bean
	public Team redSox(){                      // defines redSox
		return new TeamImplementation("RedSox");
	}

}

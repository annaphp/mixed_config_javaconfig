package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import beans.CricketGame;
import beans.Game;
import beans.Team;


@Configuration
@ComponentScan(basePackages={"beans"})         // finds  cows
@ImportResource("classpath:second_config.xml") // imports cubs bean from xml
@Import(AppConfigSecond.class)                 // imports redSox from second javaconfig
public class AppConfig {
	
	@Bean
	public Game cricketGame(Team redSox, Team cubs, Team cows){
		Game game = new CricketGame(redSox, cubs, cows); // constructor DI
		return game;
	}
	
}

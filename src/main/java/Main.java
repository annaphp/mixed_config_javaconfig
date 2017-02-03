import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.AppConfig;
import beans.Game;



public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		
		
		Game game = context.getBean("cricketGame", Game.class);
		System.out.println(game.playGame());
		
		System.out.println(context.getBeanDefinitionCount());
		for(String beanName: context.getBeanDefinitionNames())
			System.out.println(beanName);
	}

}

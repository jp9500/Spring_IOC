package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalDriver 
{
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(conf.class);
		Cage c =con.getBean(Cage.class);
		c.cageAnimal();
	}

}

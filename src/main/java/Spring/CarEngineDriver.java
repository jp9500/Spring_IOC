package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngineDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassCOnfig.class);
		System.out.println(con.getBean(Aadhar.class));
		
		Demo d1=con.getBean(Demo.class);
		Demo d2=con.getBean(Demo.class);
		Demo d3=con.getBean(Demo.class);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}

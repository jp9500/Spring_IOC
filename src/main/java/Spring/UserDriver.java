package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class UserDriver {
	
	public static void main(String[] args)
	{
		
//		ClassPathResource resource = new ClassPathResource("user.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		System.out.println(factory.getBean("user"));
//		
//		User u = (User) factory.getBean("user");
//		System.out.println(u);
		
//		ApplicationContext con = new ClassPathXmlApplicationContext("user.xml");
//		User u= con.getBean(User.class,"user");
//		
//		System.out.println(u);
		
		ApplicationContext con = new ClassPathXmlApplicationContext("user.xml");
		System.out.println(con.getBean(Aadhar.class));
	}
}

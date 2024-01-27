package Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("1")
	private int id;
	@Value("Jp")
	private String name;
	@Value("8778231615")
	private long contact;
	
	
	
	
//public User(int id, String name, long contact) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.contact = contact;
//	}




//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getContact() {
//		return contact;
//	}
//	public void setContact(long contact) {
//		this.contact = contact;
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
}

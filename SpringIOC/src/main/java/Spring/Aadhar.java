package Spring;

public class Aadhar 
{
	private int id;
	private String city;
	private long aadharNo;
	private User user;
	
	
	
public Aadhar(int id, String city, long aadharNo, User user) {
		super();
		this.id = id;
		this.city = city;
		this.aadharNo = aadharNo;
		this.user = user;
	}



//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public long getAadharNo() {
//		return aadharNo;
//	}
//	public void setAadharNo(long aadharNo) {
//		this.aadharNo = aadharNo;
//	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", city=" + city + ", aadharNo=" + aadharNo + ", user=" + user + "]";
	}
	
	

}

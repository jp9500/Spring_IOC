package Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine 
{
	@Value("1")
	private int id;
	@Value("400")
	private int cc;
	@Value("45678")
	private int Sno;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getCc() {
//		return cc;
//	}
//	public void setCc(int cc) {
//		this.cc = cc;
//	}
//	public int getSno() {
//		return Sno;
//	}
//	public void setSno(int sno) {
//		Sno = sno;
//	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", cc=" + cc + ", Sno=" + Sno + "]";
	}
	
	

}

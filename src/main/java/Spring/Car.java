package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Car 
{
	@Value("1")
	private int id;
	@Value("Swift")
	private String brand;
	@Value("9500")
	private int carNo;
	@Autowired
	private Engine e;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public int getCarNo() {
//		return carNo;
//	}
//	public void setCarNo(int carNo) {
//		this.carNo = carNo;
//	}
//	
//	public Engine getE() {
//		return e;
//	}
//	public void setE(Engine e) {
//		this.e = e;
//	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", carNo=" + carNo + ", e=" + e + "]";
	}
}

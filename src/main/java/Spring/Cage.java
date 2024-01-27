package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cage {
	@Autowired
	Animal an;
	
	public void cageAnimal() {
		an.sound();
	}
}


public class myTest {
	 
	Public boolean illegal(int maxSpeed) {
		if(speed> maxSpeed || privateCar == true) {
			return true;
		}
		return false;
	}
	
	Public boolean allGood() {
		for(int i=0; i<cars.length; i++) {
			if (cars[i].illegal(maxSpeed)==true) {
				return false;
			}
		}
		return true;
	}
	
	Public Static int legalCities(cameraInfo [] cameras) {
		int count=0;
		for (int i=0; i<camers.length; i++) {
			if (camers[i].allGood()==true) {
				count ++;
			}
		}
		return count;
	}
}

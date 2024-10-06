Public boolean illegal(int maxSpeed) {
		if(speed> maxSpeed || privateCar == true) {
			return true
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

public static int legalCities(cameraInfo[] cameras) {
	    boolean[] cityStatus = new boolean[100];
	    for (int i = 0; i < cityStatus.length; i++) {
	        cityStatus[i] = true;
	    }
	    for (int i = 0; i < cameras.length; i++) {
	        int city = cameras[i].getCity(); 
	        if (cameras[i].allGood() == false) { 
	            cityStatus[city] = false;
	        }
	    }
	    int count = 0;
	    for (int i = 0; i < cityStatus.length; i++) {
	        if (cityStatus[i]) {
	            count++;
	        }
	    }
	    return count; 
	}

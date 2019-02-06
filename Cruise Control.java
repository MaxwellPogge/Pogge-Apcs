	class CruiseControl
	{
    static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;

	public static void main(String[] args) {
        
	}

	public static void toggleCruiseControl() {
		cruiseControlSet = !cruiseControlSet;

		if(cruiseControlSet) {
			System.out.println("Cruise Control Enabled.");
		}
		else {
			System.out.println("Cruise Control Disabled.");
			speed = 0;
		}

	} 

	public static void accelerate() {
		if (cruiseControlSet && (speed < MAX_SPEED )) {
			speed += 5;
			reportSpeed();
			if (exceedsWarningThreshold(speed)); {
				alert(false)	
			} 
		}
	}

	public static void decelerate() {
		if (cruiseControlSet && (speed >= 5 )) {
			speed -= 5;
			reportSpeed();
		}
	}

	public static void reportSpeed() {
        	System.out.println "You are current speed is"+ speed;
    }

	public static void alert(Boolean isDecelerating) {
			System.out.println "You're speed is over the speed limit"
	}

	public static Boolean exceedsWarningThreshold(int speed) {
		if (speed > warningSpeed) {
			return true;
		}
		else {
			return false 
		}
	}
}
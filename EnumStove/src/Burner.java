
public class Burner {
public enum Temperature{
	HOT ("Hot"), WARM ("Warm"), COLD ("Cold");
	private String temperature;
	Temperature (String temp){
		temperature = temp;
	}
	public String toString(){
		return temperature;
	}
}
static final private int TIME_DURATION = 3;
private Setting sting;
private Temperature tmptr;
private int timeElapsed = 0;

Burner(){
	sting = sting.OFF;
	tmptr = tmptr.COLD;
}

public void increaseSetting() {
	if(sting == sting.OFF)
		sting = sting.LOW;
	else if(sting == sting.LOW)
		sting = sting.MEDIUM;
	else if(sting == sting.MEDIUM)
		sting = sting.HIGH;
}

public void decreaseSetting() {
	if(sting == sting.HIGH)
		sting = sting.MEDIUM;
	else if(sting == sting.MEDIUM)
		sting = sting.LOW;
	else if(sting == sting.LOW)
		sting = sting.OFF;
}

public void updateTemperature() {
	timeElapsed++;
	if (timeElapsed == TIME_DURATION) {
		if (sting == sting.HIGH) tmptr = tmptr.HOT;
		else if (sting == sting.MEDIUM || sting == sting.LOW) tmptr = tmptr.WARM;
		else if (sting == sting.OFF) tmptr = tmptr.COLD;
		timeElapsed = 0;
	}
}

public String getTemperature(){
	return tmptr.temperature;
}

public void display() {
	System.out.println(sting.toString());
}

}

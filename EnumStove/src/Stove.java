import java.util.ArrayList;


public class Stove {
	static final int NUM_BURNERS = 4;
	ArrayList<Burner> burners = new ArrayList<Burner>(4);
	Stove() {
		for(int i = 0; i < NUM_BURNERS; i++) {
		burners.add(new Burner());	
	}}
	public void display(){
		int tempHot = 0;
		System.out.println("Stove --------------");
		for (int i = 0; i < NUM_BURNERS; i++) {
			burners.get(i).display();
			if (burners.get(i).getTemperature().equals("Hot")) tempHot = 1;
			
		}
		if (tempHot == 1) System.out.println("HOT BURNER ALERT!");
	}
	
	public void timePassing(int minutes) {
	}
	
	public void setBurners() {
		// Simulate pressing increase setting button 3 times
				burners.get(0).increaseSetting();
				burners.get(0).increaseSetting();
				burners.get(0).increaseSetting();
				// Simulate pressing increase setting button 3 times, then
				// decrease button 1 time
				burners.get(1).increaseSetting();
				burners.get(1).increaseSetting();
				burners.get(1).increaseSetting();
				burners.get(1).decreaseSetting();
				// Simulate pressing increase setting button 1 time
				burners.get(2).increaseSetting();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stove stove = new Stove();
		stove.display();
		stove.setBurners();
		stove.display();
	}

}

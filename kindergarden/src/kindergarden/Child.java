package kindergarden;

import java.util.Random;

public class Child {
	public static final int MAX_SCORE = 100;
	private static final String[] DEFAULT_NAMES = {"Bob", "Rod", "Tod", "Flod",
			"Mary", "Annie", "Cathy", "Lucas", "Orion", "Tyler", "Elise", "Samanta"};
	
	// Both attributes range [0, MAX_SCORE], where MAX_SCORE it's the best
	// and 0 the worst possible outcome
	double eyeStatus;	
	double languageSkill;
	
	String name;
	
	// Constructor for Child with random features
	Child(){
		this.eyeStatus = getRandomRange();
		this.languageSkill = getRandomRange();
		this.name = getRandomName();
	}
	
	Child(String name,double eyeStatus, double languageSkills){
		if (!isInRange(eyeStatus) || !isInRange(languageSkills))
			throw new IllegalArgumentException("Values need to be in the [0, " + MAX_SCORE + 
					"] range");
		
		
		this.eyeStatus = eyeStatus;
		this.languageSkill = languageSkills;
		this.name = name;
	}
	
	// Returns a double between 0 and value
	private double getRandomRange() {
		return new Random().nextDouble() * MAX_SCORE;
	}
	
	private boolean isInRange(double value) {
		return (value > 0 && value < MAX_SCORE);
	}
	
	private static String getRandomName() {
	    int index = new Random().nextInt(DEFAULT_NAMES.length);
	    return DEFAULT_NAMES[index];
	}
	
}

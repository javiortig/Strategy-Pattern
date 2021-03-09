package kindergarden;

public class Oculist implements ExamStrategy{
	// Minimum score to pass eye test
	public static final int MIN_EYE_SCORE = 47;
	
	public static final float OCULIST_COST = 81.99f;
	
	@Override
	public boolean exploreChild(Child child) {
		if (child.eyeStatus < MIN_EYE_SCORE)
			return false;
		else
			return true;
	}
	
	@Override
	public void sendBill(Child child) {
		System.out.println("The cost of the oculist will be $" + OCULIST_COST);
	}
	
	@Override
	public void sendResults(Child child, boolean lastResult) {
		// Calling default method first
		ExamStrategy.super.sendResults(child, lastResult);
		
		System.out.print(child.name + " " +
				(lastResult ? "has a healthy sight" : "needs glasses") + ".\n");
	}
	
}

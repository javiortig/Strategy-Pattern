package kindergarden;

public interface ExamStrategy {
	
	public boolean exploreChild(Child child);
	
	public void sendBill(Child child);
	
	public default void sendResults(Child child, boolean lastResult) {
		System.out.print("The result for " + child.name + " was " +
				(lastResult ? "positive" : "negative") + ". ");
	}
	
	
	
}

package kindergarden;

public class DoctorContext {
	private ExamStrategy strategy;
	
	// Result obtained from last child
	private boolean lastResult;
	
	DoctorContext(){
		super();
	}
	
	DoctorContext(ExamStrategy strategy){
		super();
		this.strategy = strategy;
		this.lastResult = false;
	}
	
	public void executeAppointment(Child child) {
		this.lastResult = this.strategy.exploreChild(child);
		this.strategy.sendResults(child, lastResult);
		this.strategy.sendBill(child);
		System.out.print('\n');
	}
	
	public void setExamStrategy(ExamStrategy strategy) {
		this.strategy = strategy;
		this.lastResult = false;
	}
}

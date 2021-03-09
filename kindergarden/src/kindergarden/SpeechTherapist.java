package kindergarden;

public class SpeechTherapist implements ExamStrategy{
	// Minimum score to pass eye test
		public static final int MIN_SPEECH_SCORE = 53;
		
		public static final float SPEECH_COST = 67.39f;
		
		@Override
		public boolean exploreChild(Child child) {
			if (child.eyeStatus < MIN_SPEECH_SCORE)
				return false;
			else
				return true;
		}
		
		@Override
		public void sendBill(Child child) {
			System.out.println("The cost of the speech appointment will be $" + SPEECH_COST);
		}
		
		@Override
		public void sendResults(Child child, boolean lastResult) {
			// Calling default method first
			ExamStrategy.super.sendResults(child, lastResult);
			
			System.out.print(child.name + " " +
					(lastResult ? "has a good pronunciation" : "needs to train more the speech") + ".\n");
		}
		
}

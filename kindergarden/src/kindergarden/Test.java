package kindergarden;

import java.util.Scanner; 

public class Test {
	public static final int KINDER_GARDEN_SIZE = 12;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selection = 0;
		
		// The doctor context strategy class
		DoctorContext doctor = new DoctorContext();
		
		// Menu questions:
		do {
			System.out.println("Need an oculist(1) or a speech "
		    		+ "therapist(0)?");
		    selection = sc.nextInt();
		    
		    if(selection == 1)
		    	doctor.setExamStrategy(new Oculist());
		    else if(selection == 0)
		    	doctor.setExamStrategy(new SpeechTherapist());
		    
		}while(selection != 1 && selection != 0);
	    sc.close();
	    
		// Generate the kinderGarden
		Child kinderGarden[] = new Child[KINDER_GARDEN_SIZE];
		for(int i = 0; i < KINDER_GARDEN_SIZE; i++) {
			kinderGarden[i] = new Child();
		}
		
		for(int i = 0; i < KINDER_GARDEN_SIZE; i++) {
			doctor.executeAppointment(kinderGarden[i]);
		}
		
	}
}

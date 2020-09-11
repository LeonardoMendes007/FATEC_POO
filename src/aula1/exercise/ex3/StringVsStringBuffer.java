package aula1.exercise.ex3;

public class StringVsStringBuffer {
	
	public static void main(String[] args) {
		
		String s1 = "";
		StringBuffer s2 = new StringBuffer("");
		
		int forLength = 600000;
		
		float t1 = System.currentTimeMillis();
		
//		for (int i = 0; i < forLength; i++) {
//		    s1 = s1 + i;
//		}
//		
		float t2 = System.currentTimeMillis();
		
//	    float tempoString = t2 - t1;
//	    
//	    System.out.println("Tempo da String: " + tempoString);
	    
        t1 = System.currentTimeMillis();
		
		for (int i = 0; i < forLength; i++) {
		    s2.append(i);
		}
		
		t2 = System.currentTimeMillis();
		
	    float tempoStringBuffer = t2 - t1;
		
	    System.out.println("Tempo da StringBuffer: " + tempoStringBuffer);
	}

}

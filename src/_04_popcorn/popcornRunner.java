package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornRunner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("what flavor of popcorn would you like");
	
	Popcorn pop = new Popcorn(flavor);
	Microwave micro = new Microwave();
	
	micro.putInMicrowave(pop);
	
	String cook = JOptionPane.showInputDialog("how much time (minutes) does the popcorn cook for");
	int cTime = Integer.parseInt(cook);
	
	micro.setTime(cTime);
	
	micro.startMicrowave();
	
	pop.applyHeat();

}
}

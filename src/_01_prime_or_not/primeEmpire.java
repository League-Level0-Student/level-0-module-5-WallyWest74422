package _01_prime_or_not;
import javax.swing.JOptionPane;

public class primeEmpire {
public static void main(String[] args) {
	String number=JOptionPane.showInputDialog("Please enter a number");
	int num = Integer.parseInt(number);
	for(int i=2;i<num;i++) {
		if(num % i ==0) {
			JOptionPane.showMessageDialog(null, "This number is not PRIME");
			break;
		}if(num % i ==1) {
			JOptionPane.showMessageDialog(null, "This number is PRIME");
			break;
	}
	}
}
}

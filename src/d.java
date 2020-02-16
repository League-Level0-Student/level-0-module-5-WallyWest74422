import javax.swing.JOptionPane;

public class d {
	public static void main(String[] args) {

		for (int i = 0; i < 12; i++) {

			for (int a = 2007; a < 2019; a++) {
				JOptionPane.showMessageDialog(null, "In " + a + " I was " + i++);
			}
		}

	}
}

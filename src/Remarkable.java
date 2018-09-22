import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog(null, "What's your name?");
		if (name.equalsIgnoreCase("julia")) {
			JOptionPane.showMessageDialog(null, "Hi " + name + ". You're remarkable because you're going to NASA.");
		} else if (name.equalsIgnoreCase("ronald")) {
			JOptionPane.showMessageDialog(null, "Hi "+ name + "You're remarkable because you're the youngest stundent in the league  .");
		}
	}

}

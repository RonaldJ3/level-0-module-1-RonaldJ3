import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
		int score = 0 ;
		String say = JOptionPane.showInputDialog("I am always hungry, I must always be fed, the finger I touch, will soon be red.");
		if (say.equalsIgnoreCase("fire")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct score "+ score);
		}
		else{
			
			JOptionPane.showMessageDialog(null, "wrong score " +score );
		}
		String sup = JOptionPane.showInputDialog("A murderer is condemned to death. He has to choose between three rooms: the first is full of raging fires; the second, assassins whith loaded guns; and third, lions who haven't eaten in years. Which room is the safest?");
		if (sup.equalsIgnoreCase("third")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct score "+ score);
		}
		else{
			
			JOptionPane.showMessageDialog(null, "wrong score " +score );
		}
		
		
		String doom = JOptionPane.showInputDialog("Many have heard me but none have seen me, and I will not speak unless spoken to.");
		if (doom.equalsIgnoreCase("echo")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct score "+ score);
		}
		else{
			
			JOptionPane.showMessageDialog(null, "wrong score " +score );
		}
	}
}
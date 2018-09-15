import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog(null, "Whats your name?");
if(name.equalsIgnoreCase("julia")){
	JOptionPane.showMessageDialog(null, "Hi " + name + ". Your Remarkable");
	 
}
	}

}

import javax.swing.JOptionPane;

public class SecretMessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "zone";
		String message = JOptionPane.showInputDialog("Hi. Please type a secret message.");

		String Input = JOptionPane
				.showInputDialog("You can only see the secret message if you you can guess the passcode");

		if (Input.equalsIgnoreCase(password)) {
			JOptionPane.showMessageDialog(null, message);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!");
		}
	}

}

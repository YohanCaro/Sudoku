package co.yohan.gms.view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * Clase UpdatesDialog - Clase que crea un JDialog con la info de 
 * las actualizaciones
 * 
 * @version 1.4 - 03/02/2019
 * @author Yohan Caro
 *
 */
public class UpdatesDialog extends JDialog {
	
	private String message;
	private JTextArea taText;

	public UpdatesDialog() {
		this.setTitle("News");
		this.setSize(400,540);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setTextMessage();
		this.init();
		this.icon();
		this.setVisible(true);
	}
	
	private void init() {		
		taText = new JTextArea(message);
		taText.setEditable(false);
		this.add(taText);
	}
	
	public void icon() {
		ImageIcon icon = new ImageIcon("src/res/icons/NEO.png");
		ImageIcon icon2 = new ImageIcon(icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		this.setIconImage(icon2.getImage());	
	}
	
	private void setTextMessage() {
		message = "		V 0.4.1! \n"
				+ "- Delete code trash\n"
				+ "- Commits"
				+ "\n\n"
				+ "		V 0.4!\n"
				+ "- New games!\n"
				+ "- Bug fixes\n"
				+ "   -- Default numbers aren't editable now!\n"
				+ "\n\n"
				+ "		V 0.3!\n"
				+ "- New buttons options\n"
				+ "   -- New Game button\n"
				+ "   -- Reset button\n"
				+ "   -- Go out button in frame\n"
				+ "- New dialog with infomation updates\n"
				+ "- Bug fixes\n"
				+ "   -- Color green when you win!\n"
				+ "\n\n"
				+ "		V 0.2!\n"
				+ "- New app's image\n"
				+ "- Bug fixes\n"
				+ "   -- Best performance on threads\n"
				+ "   -- Colors in numbers by default\n"
				+ "\n\n"
				+ "		V 0.1!\n"
				+ "- The game begin on Alpha!\n"
				+ "- Colors in errors\n"
				+ "- Thread that verific the characters in the tab\n"
				+ "- Dialog with options for begin";
	}
	
}

package co.yohan.tgms.test;

import javax.swing.JFrame;
import javax.swing.JTextField;

import co.yohan.gms.utilities.Utilities;

public class TestUtilities {
	private static JTextField field2;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(null);
		
		field2 = new JTextField();
		jFieldVerificator((short) 1);
		field2.setBounds(50, 50, 150, 50);
		
		frame.add(field2);
		frame.setVisible(true);
	}
	
	public static void jFieldVerificator(short tam) {
		JTextField text = new JTextField();
		new Thread(new Runnable() {
			String string;
			@Override
			public void run() {
				while (true) {
					if (field2.getText().length() > tam) {
						string = field2.getText();
						field2.setText(Utilities.cutLastChars(1, string));
					}
				}
			}
		}).start();
	}
}

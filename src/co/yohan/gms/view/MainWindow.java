package co.yohan.gms.view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import co.yohan.gms.controller.Events;

public class MainWindow extends JFrame{
	
	private Title pTitle;
	private GameSpace gameSpace;
	private Events events;
	private JDialogLogin jLogin;
	private ButtonsOptionsPanel bOptions;

	public MainWindow() {
		this.setTitle("Sudoku Game (v 0.4)");
		this.setSize(700, 600);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		this.init();
		this.addMouseListener(events);
		this.icon();
	}
	
	private void init() {
		events = new Events(this);
				
		pTitle = new Title();
		this.add(pTitle, BorderLayout.NORTH);
		
		gameSpace = new GameSpace();
		this.add(gameSpace, BorderLayout.CENTER);
		
		bOptions = new ButtonsOptionsPanel(this);
		this.add(bOptions, BorderLayout.EAST);
		
		jLogin = new JDialogLogin(this);
	}
	
	public void icon() {
		ImageIcon icon = new ImageIcon("src/res/icons/NEO.png");
		ImageIcon icon2 = new ImageIcon(icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		this.setIconImage(icon2.getImage());	
	}
	
	public Events getEvents() {
		return events;
	}

	public Title getpTitle() {
		return pTitle;
	}

	public GameSpace getGameSpace() {
		return gameSpace;
	}

	public JDialogLogin getjLogin() {
		return jLogin;
	}
	
	public ButtonsOptionsPanel getbOptions() {
		return bOptions;
	}
}

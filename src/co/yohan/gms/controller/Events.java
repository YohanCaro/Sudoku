package co.yohan.gms.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import co.yohan.gms.constants.Constans;
import co.yohan.gms.model.Tablero;
import co.yohan.gms.utilities.Utilities;
import co.yohan.gms.view.JDialogLogin;
import co.yohan.gms.view.MainWindow;
import co.yohan.gms.view.UpdatesDialog;

/**
 * Clase Events - Maneja los eventos de la vista
 * 
 * @version 1.2 09/03/2019
 * @author Yohan Caro
 *
 */
public class Events implements ActionListener {
	
	private MainWindow window;
	private Tablero tab;
	private boolean win;
	private UpdatesDialog uDialog;
	
	/**
	 * Constructor
	 * @param window ventana principal
	 */
	public Events(MainWindow window) {
		this.window = window;
		tab = new Tablero();
		win = false;
	}
	
	/**
	 * Eventos de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String comand = e.getActionCommand();
		
		if (Constans.SIGN_PANEL_ACT.equals(comand)) {
			window.setVisible(true);
			window.getjLogin().setVisible(false);
			window.getGameSpace().setTablero(tab.getMatriz());
			this.verificator();
		} else if (Constans.UPDATES_ACT.equals(comand)) {
			uDialog = new UpdatesDialog();
		} else if (Constans.EXIT_PANEL_ACT.equals(comand)) {
			System.exit(0);
		} else if (Constans.NEW_GAME_ACT.equals(comand)) {
			tab = new Tablero();
			window.getGameSpace().actTextFields();
			window.getGameSpace().setTablero(tab.getMatriz());
			window.getGameSpace().resetTab();
			window.getGameSpace().updateMatrix();
		} else if (Constans.RESET_ACT.equals(comand)) {
			window.getGameSpace().resetTab();
		} else if (Constans.GO_OUT.equals(comand)) {
			window.getjLogin().getbSign().setText("Continue");
			window.getjLogin().setVisible(true);
		}
	}
	
	/**
	 * Hilo que verifica si el usuario tiene un error y cambia de color la casilla
	 * Tambi�n evalua si el usuario ya gan� el juego
	 * Muere cuando el jugador gana
	 */
	public void verificator() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (!win) {
					window.getGameSpace().updateMatrix();
					for (int i = 0; i < 9; i++) {
						for (int j = 0; j < 9; j++) {
							if (!tab.verSubMatriz(tab.extraMatriz(i, j, window.getGameSpace().getMat()), 1)) {
								window.getGameSpace().getTextFields()[i][j].setBackground(Color.RED);
							} else if (Utilities.contNumberOnArray(window.getGameSpace().getMat()[i][j],
									Utilities.extraRow(window.getGameSpace().getMat(), i)) > 1) {
								window.getGameSpace().getTextFields()[i][j].setBackground(Color.RED);
							} else if (Utilities.contNumberOnArray(window.getGameSpace().getMat()[i][j],
									Utilities.extraCol(window.getGameSpace().getMat(), j)) > 1) {
								window.getGameSpace().getTextFields()[i][j].setBackground(Color.RED);
							} else if (tab.verMatriz(window.getGameSpace().getMat(), 9)) {
								window.getGameSpace().getTextFields()[i][j].setBackground(Color.GREEN);
								win = true;
							} else {
								window.getGameSpace().getTextFields()[i][j].setBackground(Color.WHITE);
							}
						}		
					}
				}
			}
		}).start();
	}

}

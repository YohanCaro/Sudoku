package co.yohan.gms.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.swing.JTextField;

import co.yohan.gms.utilities.Utilities;

/**
 * Clase GameSpace - Area de juego
 * 
 * @version 1.5 - 21/10/2018
 * @author Yohan Caro
 *
 */
public class GameSpace extends JPanel {
	
	private Adorns adorns[][];
	private JTextField textFields[][];
	private int mat[][];
	
	/**
	 * Constructor
	 */
	public GameSpace() {
		this.setLayout(null);
		
		this.init();
	}
	
	/**
	 * Inica los metodos
	 * Crea los JTextFields para escribir los números
	 */
	private void init() {
		this.addSquares();
		mat = new int[9][9];
		
		textFields = new JTextField[9][9];
		
		for (int i = 0; i < textFields.length; i++) {
			for (int j = 0; j < textFields[i].length; j++) {
				textFields[i][j] = new JTextField("");
				textFields[i][j].setBounds( (i* 50 + 75)+3, (j * 50 + 25)+3, 46, 46);
				this.add(textFields[i][j]);
			}
		}
	}
	
	/**
	 * Añade los cuadrados de la parte grafica
	 */
	private void addSquares() {
		adorns = new Adorns[3][3];
		for (int i = 0; i < adorns.length; i++) {
			for (int j = 0; j < adorns[i].length; j++) {
				adorns[i][j] = new Adorns(i* 150 + 75, j * 150 + 25);
			}
		}
	}
	
	/**
	 * pinta los cuadrados
	 */
	public void paint(Graphics g) {
		super.paint(g);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				adorns[i][j].draw((Graphics2D) g);
			}
		}
	}
	
	/**
	 * Setea los elementos por defecto de un tablero inical
	 * @param tab tablero
	 */
	public void setTablero(int[][] tab) {
		for (int i = 0; i < textFields.length; i++) {
			for (int j = 0; j < textFields[0].length; j++) {
				if (tab[i][j] != 0) {
					textFields[i][j].setText("" + tab[i][j]);
					textFields[i][j].setFont(new Font("Arial-Black", 1, 25));
					textFields[i][j].setForeground(Color.BLUE);
					textFields[i][j].setEditable(false);
				} else {
					textFields[i][j].setFont(new Font("Arial", 4, 25));
				}
				
			}
		}
	}
	
	/**
	 * Actualiza la matrix del juego
	 * * Verifica que solo se escriban numeros de un solo digito en los campos
	 * * No admite carcateres diferentes de numeros
	 */
	public void updateMatrix() {
		String string;
		int tam = 1;
			for (int i = 0; i < textFields.length; i++) {
				for (int j = 0; j < textFields.length; j++) {
					
					if (textFields[i][j].getText().isEmpty() || textFields[i][j].getText() == null) {
						mat[i][j] = 0;
					} else {
						if (Utilities.isNumeric(textFields[i][j].getText())) {
							mat[i][j] = Utilities.convertStringtoInt(textFields[i][j].getText());
						} else {
							Utilities.showMessageError("Ingrese solo numeros del 1 al 9");
							textFields[i][j].setText("");
						}
					}
					
					//Limite del tam de los textF
					if (textFields[i][j] != null) {
						if (textFields[i][j].getText().length() > tam) {
							string = textFields[i][j].getText();
							textFields[i][j].setText(Utilities.cutLastChars(1, string));
						}
					}
				}
			}
	}
	
	/**
	 * Resea el tablero
	 */
	public void resetTab() {
		for (int i = 0; i < textFields.length; i++) {
			for (int j = 0; j < textFields.length; j++) {
				if (textFields[i][j].isEditable()) {
					textFields[i][j].setText("");
				}
			}
		}
	}
	
	/**
	 * Vuelve editable los elementos iniciales
	 */
	public void actTextFields() {
		for (int i = 0; i < textFields.length; i++) {
			for (int j = 0; j < textFields.length; j++) {
				if (!textFields[i][j].isEditable()) {
					textFields[i][j].setEditable(true);
				}
			}
		}
	}
	
	public int[][] getMat() {
		return mat;
	}
	
	public JTextField[][] getTextFields() {
		return textFields;
	}
}

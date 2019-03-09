package co.yohan.gms.model;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase Square - Clase que crea un rectangulo con valores especificados
 * 
 * @version 1.0 - 20/10/2018
 * @author Yohan Caro
 *
 */
public class Square extends JPanel{

	private int x, y, x2, y2;
	private Color colorFondo, colorBorde;
	private BasicStroke bs;
	private Rectangle rectangulo;
	private JTextField tText;
	
	/**
	 * Constructor (Pasar a inglés!) XD
	 * @param x pos x
	 * @param y pos y
	 * @param x2 ancho
	 * @param y2 alto
	 * @param colorFondo color de fondo
	 * @param colorBorde color de borde
	 * @param bs gruso del borde
	 */
	public Square(int x, int y, int x2, int y2, Color colorFondo, Color colorBorde, BasicStroke bs) {
		rectangulo = new Rectangle(x, y, x2, y2);
		this.colorFondo = colorFondo;
		this.colorBorde = colorBorde;
		this.bs = bs;
		
		this.setLayout(new BorderLayout());
		
		this.init();
	}
	
	/**
	 * Init
	 */
	private void init() {
		this.tText = new JTextField();
		tText.setFont(new Font("Ravie", 2, 12));
		tText.setText("1");
		this.add(tText);
	}
	
	/**
	 * Dibuja la figura
	 * @param g graphics
	 */
	public void dibujar(Graphics2D g) {
		 g.setPaint(colorFondo);
	     g.fill(rectangulo);
	     g.setStroke(bs);
	     g.setPaint(colorBorde);
	     g.draw(rectangulo);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}

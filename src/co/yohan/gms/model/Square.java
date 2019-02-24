package co.yohan.gms.model;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Square extends JPanel{

	private int x, y, x2, y2;
	private Color colorFondo, colorBorde;
	private BasicStroke bs;
	private Rectangle rectangulo;
	private JTextField tText;
	
	public Square(int x, int y, int x2, int y2, Color colorFondo, Color colorBorde, BasicStroke bs) {
		rectangulo = new Rectangle(x, y, x2, y2);
		this.colorFondo = colorFondo;
		this.colorBorde = colorBorde;
		this.bs = bs;
		
		this.setLayout(new BorderLayout());
		
		this.init();
	}
	
	private void init() {
		this.tText = new JTextField();
		tText.setFont(new Font("Ravie", 2, 12));
		tText.setText("1");
		this.add(tText);
	}
	
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

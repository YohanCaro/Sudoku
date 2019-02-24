package co.yohan.gms.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.List;

import co.yohan.gms.model.Square;

public class Adorns {
	
	private static int ancho = 50;
	private static int alto = 50;
	private Square squares[][];
	private Square squares2[][];
	
	public Adorns(int x, int y) {
		squares = new Square[3][3];
		squares2 = new Square[1][1];
		
		for (int i = 0; i < squares.length; i++) 
			for (int j = 0; j < squares.length; j++) 
				squares[i][j] = new Square(j* ancho + x, i* alto + y, ancho, alto, Color.WHITE, Color.BLACK, new BasicStroke(1));
		
		for (int i = 0; i < squares2.length; i++) 
			for (int j = 0; j < squares2.length; j++) 
				squares2[i][j] = new Square(i* 150 + x, j* 150 + y, 150, 150, Color.WHITE, Color.BLACK, new BasicStroke(5));
	}
	
	public void draw(Graphics2D g) {
		//Cuadros grandes
		for (int i = 0; i < squares2.length; i++) 
			for (int j = 0; j < squares2.length; j++) 
				squares2[i][j].dibujar(g);
		
		//Cuadros pequeños
		for (int i = 0; i < squares.length; i++) 
			for (int j = 0; j < squares.length; j++) 
				squares[i][j].dibujar(g);
		
	}
	

}

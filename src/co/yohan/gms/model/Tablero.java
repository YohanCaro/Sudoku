package co.yohan.gms.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import co.yohan.gms.persistence.SudokuCSVDAO;
import co.yohan.gms.persistence.Sudokus;
import co.yohan.gms.utilities.Utilities;

public class Tablero {
	
	private int matriz[][];
	private SudokuCSVDAO csvdao;
	
	public Tablero() {
		Random rnd = new Random();
		int number = (rnd.nextInt(20));
		
		ArrayList<int[][]> list = null;
		
		csvdao = new SudokuCSVDAO();
		try {
			list = csvdao.leerList("src\\data\\sudokus_save.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Mat: " + number);
		this.setMatriz(list.get(number));
	}
	
	public boolean verSubMatriz(int[][] matriz, int cant) {
		for (int k = 1; k <= 9; k++) {
			if (Utilities.contNumberOnMatrix(k, matriz) > cant) {
				return false;
			}
		}
		return true;
	}
	
	public boolean verMatriz(int[][] matriz, int cant) {
		for (int k = 1; k <= 9; k++) {
			if (Utilities.contNumberOnMatrix(k, matriz) != cant) {
				return false;
			}
		}
		return true;
	}
	
	public int[][] extraMatriz(int a, int b, int[][] mat) {
		int arra[] = new int[9];
		int cont = 0;
		int i2 = (a/3)*3;
		int j2 = (b/3)*3;
		for (int i = (a/3)*3; i < i2+3; i++) {
			for (int j = (b/3)*3; j < j2+3; j++) {
				arra[cont] = mat[i][j];
				cont++;
			}
		}
		
		return this.arrayToMatriz(arra);
	}
	
	public int[][] arrayToMatriz(int vec[]) {
		int matriz[][] = new int[3][3];
		int cont = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = vec[cont];
				cont++;
			}
		}
		return matriz;
	}
	
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
		
	public int[][] getMatriz() {
		return matriz;
	}
}

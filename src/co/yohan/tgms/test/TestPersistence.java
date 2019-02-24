package co.yohan.tgms.test;

import java.io.IOException;
import java.util.ArrayList;

import co.yohan.gms.persistence.SudokuCSVDAO;

public class TestPersistence {
	public static void main(String[] args) {
		IoManager io = new IoManager();
		
//		int[][] mat = new int[9][9];
//		int[][] mat2 = new int[9][9];
//		int[][] mat3 = new int[9][9];
//		
//		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < mat.length; j++) {
//				if ((i+j)%2 == 0) {
//					mat[i][j] = 1;
//				} else {
//					mat[i][j] = 2;
//				}
//			}
//		}
//		
//		for (int i = 0; i < mat2.length; i++) {
//			for (int j = 0; j < mat2.length; j++) {
//				if ((i+j)%2 == 0) {
//					mat2[i][j] = 3;
//				} else {
//					mat2[i][j] = 4;
//				}
//			}
//		}
//		
//		for (int i = 0; i < mat3.length; i++) {
//			for (int j = 0; j < mat3.length; j++) {
//				if ((i+j)%2 == 0) {
//					mat3[i][j] = 5;
//				} else {
//					mat3[i][j] = 6;
//				}
//			}
//		}
//		
//		ArrayList<int[][]> list = new ArrayList<>();
//		list.add(mat);
//		list.add(mat2);
//		list.add(mat3);
		
		SudokuCSVDAO sudoku = new SudokuCSVDAO();
		
//		try {
//			sudoku.escribirList(list, "C:\\Users\\Edward\\Documents\\persis\\sudoku.csv");
//			System.out.println("Se generó un archivo!");
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.err.println(e.getMessage());
//		}
				
		try {
			System.out.println(sudoku.leerList("C:\\Users\\Edward\\Documents\\persis\\sudoku.csv").size());
			io.escribeMatrizInt(sudoku.leerList("C:\\Users\\Edward\\Documents\\persis\\sudoku.csv").get(0));
			io.escribeMatrizInt(sudoku.leerList("C:\\Users\\Edward\\Documents\\persis\\sudoku.csv").get(1));
			io.escribeMatrizInt(sudoku.leerList("C:\\Users\\Edward\\Documents\\persis\\sudoku.csv").get(2));
			System.out.println("Se cargó un archivo!s");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
	}
}

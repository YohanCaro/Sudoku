package co.yohan.gms.model;

import co.yohan.gms.utilities.Utilities;
import co.yohan.tgms.test.IoManager;

public class Operator {
	
	private int matrix[][];
	private IoManager io;
	
	public Operator() {
		matrix = new int[9][9];
		io = new IoManager();
//		this.fillMatrix();
//		this.fillEmptyMatrix();
		this.verificator(0, 0);
//		this.verificator2(0, 0);
	}
	
	public int[] fillArray(int tam) {
		int[] array = new int[tam];
		for (int i = 0; i < array.length; i++) {
			while (Utilities.contNumberOnArray(array[i], array) != 1 || array[i] == 0) {
				array[i] = Utilities.nRandom(0, 10);
			}
		}
		
		return array;
	}
	
	public int[] emptyArray(int tam) {
		int[] array = new int[tam];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		
		return array;
	}
	
	public void fillMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Utilities.nRandom(0, 10);
			}
		}
	}	
	
	public void fillEmptyMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = 0;
			}
		}
	}	
	
	/**
	 * Big operation!
	 */
	public void verificator(int a, int b) {
		for (int i = a; i < matrix.length; i++) {
			for (int j = b; j < matrix.length; j++) {
				matrix[i][j] = Utilities.nRandom(0, 10);
				System.out.println(matrix[i][j]);
				int number = matrix[i][j];
				int row[] = Utilities.extraRow(matrix, i);
				int col[] = Utilities.extraCol(matrix, j);
				
				while (!Utilities.isNumberOnArray(number, row) || !Utilities.isNumberOnArray(number, col) 
						|| !this.verSubMatrizWithOne(this.extraMatriz(i, j), number)) {
					System.out.println("Entro");
					if (!Utilities.isNumberOnArray(number, row)) {
						System.out.println("Row");
						
						if ((!Utilities.isNumberOnArray(number, col) || !this.verSubMatrizWithOne(this.extraMatriz(i, j), number))  
								&& ((i+j) >= 6)) {
							this.changeRow(i, this.emptyArray(9));
//							this.changeRow(i, this.fillArray(9));
							System.out.println("Row 2");
//							this.verificator(i, 0);
							j = 0;
						} else {
							matrix[i][j] = Utilities.nRandom(0, 10);
						}
//						matrix[i][j] = Utilities.nRandom(0, 10);
					} else if (!Utilities.isNumberOnArray(number, col) ) {
						 System.out.println("Col");
						if ((!Utilities.isNumberOnArray(number, row) || !this.verSubMatrizWithOne(this.extraMatriz(i, j), number))  
								&& ((i+j) >= 6)) {
							this.changeRow(i, this.emptyArray(9));
//							this.changeRow(i, this.fillArray(9));
							System.out.println("Col 2");
//							this.verificator(i, 0);
							j = 0;
						} else {
							matrix[i][j] = Utilities.nRandom(0, 10);
						}
//						 matrix[i][j] = Utilities.nRandom(0, 10);
					} else if (!this.verSubMatrizWithOne(this.extraMatriz(i, j), number)) {
						System.out.println("Mat");
						if ((!Utilities.isNumberOnArray(number, row) || !Utilities.isNumberOnArray(number, col))  
								&& ((i+j) >= 6)) {
							this.changeRow(i, this.emptyArray(9));
//							this.changeRow(i, this.fillArray(9));
							System.out.println("Mat 2");
//							this.verificator(i, 0);
							j = 0;
						} else {
							matrix[i][j] = Utilities.nRandom(0, 10);
						}
					}
					
					
					System.out.println(i + " - " + j);
					System.out.println("Cambio: " + number +" por " + matrix[i][j]);
					row = Utilities.extraRow(matrix, i);
					col = Utilities.extraCol(matrix, j);
					number = matrix[i][j];
				}
				
			}
			io.escribeMatrizInt(matrix);
		}
	}
	
	public void verificator2(int a, int b) {
		this.changeRow(0, this.fillArray(9));
		for (int i = a+1; i < matrix.length; i++) {
			this.changeRow(i, this.fillArray(9));
			for (int j = 0; j < matrix[0].length; j++) {
				io.escribeMatrizInt(matrix);
				System.out.println(i + " X");
				while (!verificator3(i, j)) {
					System.out.println(".");
					this.changeRow(i, this.fillArray(9));
				}
			}
		}
	}
	
	public boolean verificator3(int a, int b) {
		for (int i = a; i < matrix.length; i++) {
			for (int j = b; j < matrix.length; j++) {
				int number = matrix[i][j];
				System.out.println(i + "/" + j);
				if (!Utilities.isNumberOnArray(number, Utilities.extraCol(matrix, j)) 
						|| !this.verSubMatrizWithOne(this.extraMatriz(i, j), number)) {
					System.out.println("F");
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean verSubMatriz(int[][] matriz) {
		for (int k = 1; k <= 9; k++) {
			if (Utilities.contNumberOnMatrix(k, matriz) != 1) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean verSubMatrizWithOne(int[][] matriz, int number) {
		if (Utilities.contNumberOnMatrix(number, matriz) != 1) {
			return false;
		}
		return true;
	}
		
	public int[][] extraMatriz(int a, int b) {
		int arra[] = new int[9];
		int cont = 0;
		int i2 = (a/3)*3;
		int j2 = (b/3)*3;
		for (int i = (a/3)*3; i < i2+3; i++) {
			for (int j = (b/3)*3; j < j2+3; j++) {
				arra[cont] = matrix[i][j];
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
	
	public void changeRow(int row, int[] vec) {
		for (int j = 0; j < vec.length; j++) {
			matrix[row][j] =  vec[j];
		}
	}
	
	public void changeCol(int col, int[] vec) {
		for (int i = 0; i < vec.length; i++) {
			matrix[i][col] =  vec[i];
		}
	}
	
	public void changeSubMatriz(int row, int col) {
		int i2 = (row/3)*3;
		int j2 = (col/3)*3;
		
		int cont2 = 0;
		for (int i = (row/3)*3; i < i2+3; i++) {
			int cont = 0;
			for (int j = (col/3)*3; j < j2+3; j++) {
				this.matrix[i][j] = Utilities.matRandom()[cont2][cont];
				cont++;
			}
			cont++;
		}
	}
	
	public int[][] getMatrix() {
		return matrix;
	}
	
}
